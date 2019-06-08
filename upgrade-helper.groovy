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

    file.eachLine  { line ->
      if(line.startsWith("abstract_short")) {
        line = line.replace("abstract_short", "summary")
      }

      if(line.startsWith("[[url_custom]]") || line.startsWith("url_custom")) {
        line = line.replace("url_custom", "links")
      }

      newFile << line + "\n"
    }

  }
}
