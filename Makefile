
stack: compile
	@echo "Running Stacks ...\n"
	@java -classpath class_files Main
	
compile: 
	@echo "\nCompiling Files ...\n" 
	@javac -d class_files Main.java
	
	
