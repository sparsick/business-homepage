#!/usr/bin/env groovy
import groovy.io.FileType

def path = args[0]

def list = []
def dir = new File(path)
dir.eachFileRecurse (FileType.FILES) { file ->
  if(!file.name.startsWith("_")){
    println file
    def oldName = file.path
    file.renameTo(new File(oldName + ".bck"))
    file = new File(oldName + ".bck")
    def newFile = new File(oldName)
    newFile.delete()

    boolean foundFirst = false
    file.eachLine  { line ->
      if(line.startsWith("+++") && !foundFirst) {
        foundFirst = true
      }

      if(line.startsWith("+++") && foundFirst) {
        newFile << '''
# Featured image
# To use, add an image named `featured.jpg/png` to your page's folder.
[image]
# Caption (optional)
caption = ""

# Focal point (optional)
# Options: Smart, Center, TopLeft, Top, TopRight, Left, Right, BottomLeft, Bottom, BottomRight
focal_point = ""
'''
      }
      newFile << line + "\n"
    }

  }
}
