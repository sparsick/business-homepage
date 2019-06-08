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
      newFile << line + "\n"

      if(line.startsWith("date")) {
        newFile << "all_day = true\n"
      }



    }

  }
}
