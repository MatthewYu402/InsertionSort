# Makefile for Insertion Sort Algorithm

# Variables
JAVA_FILE = Main.java
CLASS_FILE = Main.class
MAIN_CLASS = Main

# Default target
all: compile

# Compile all class files
compile: $(CLASS_FILE)

$(CLASS_FILE): $(JAVA_FILE)
	@javac $(JAVA_FILE)

# Run compiled files
run: $(CLASS_FILE)
	@java $(MAIN_CLASS)

clean:
	@rm -f *.class


