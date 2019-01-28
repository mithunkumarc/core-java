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
        
        
##### two option : set java globally or locally
	
        globally : no need to set java path locally
			login to rootuser
			sudo -
			password : mithun123
			# create gedit file
			put JAVA_HOME and PATH variables in file openjdk.sh
			save openjdk.sh in folder "etc/profile.d"

	Locally : 
                in home folder , there is a hidden file called .profile, set java path in this file
		mithun@linux:~$ gedit ~/.profile
		above command opens .profile in gedit
		add path as mentioned below
			
		export JAVA_HOME=/opt/jdk-11/
		PATH="$HOME/bin:$HOME/.local/bin:$PATH:$JAVA_HOME/bin"


		# check java version
		mithun@linux:~$ source .profile
		mithun@linux:~$ java -version
		# source command to load file again to reflect changes        
        
        
        
##### set java path for eclipse
        open eclipse.ini file
        set below command before vmargs
        ##
                -vm 
                /opt/jdk-11/bin/java
        ##
        
        
> source video : https://www.youtube.com/watch?v=TaIzZU28xVs


#### docker install ubuntu : 


		https://docs.docker.com/install/linux/docker-ce/ubuntu/
		https://www.javatpoint.com/docker-java-example
