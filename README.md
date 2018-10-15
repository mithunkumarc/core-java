# samples on core-java


installing java 10 on ubuntu 

source : 
1.
https://www.linuxuprising.com/2018/04/install-oracle-java-10-in-ubuntu-or.html
2.
https://launchpad.net/~linuxuprising/+archive/ubuntu/java

steps :

add third party installer

1.
*************************************************
sudo add-apt-repository ppa:linuxuprising/java
*************************************************
sudo apt-get update
*************************************************
sudo apt install oracle-java10-installer
*************************************************
sudo apt install oracle-java10-set-default
*************************************************

2.cross check : "java -version"


*****************************************************

##### installing openjdk 11
        download tar file
        extract to opt folder
        mithun@localhost:~/Downloads$ sudo tar -xzf openjdk-11_linux-x64_bin.tar.gz -C /opt
        set home
        mithun@localhost:/opt$ export JAVA_HOME=/opt/jdk-11/
        set path
        mithun@localhost:/opt$ export PATH=$PATH:$JAVA_HOME/bin
