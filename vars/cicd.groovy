def newGit(repo)
{
  git "${repo}"
}

def newmaven()
{
  sh 'mvn package'
}

def newDeploy(ip,appname)
{
  deploy adapters: [tomcat9(credentialsId: 'b7afcd11-dc4e-4f4e-a8af-990bd5353677', path: '', url: "${ip}")], contextPath: "${appname}", war: '**/*.war'
}

def newselenium(path)
{
  sh 'java -jar "${path}"testing.jar'
}


