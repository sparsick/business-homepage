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
      if(line.startsWith("date")) {
        line = line.replace("date", "publishDate")
      }

      if(line.startsWith("time_start")) {
        line = line.replace("time_start", "date")
      }

      newFile << line + "\n"
    }

  }
}
