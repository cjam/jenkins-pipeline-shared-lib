def String call() {
  def commit = null
  def changeLogSets = currentBuild.changeSets
  if(changeLogSets.size()>0 && changeLogSets.items.size() > 0){
    commit = changeLogSets[0].items[changeLogSets.items.size()-1]
  }
  return commit
}

