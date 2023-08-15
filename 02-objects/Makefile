# Copyright(C) 2023 Pedro Henrique Penna <pedrohenriquepenna@gmail.com>
# Licensed under the MIT license.

JAVAC = javac
JAVA = java

JAVAC_FLAGS = -Xlint:all

SOURCES = $(wildcard *.java)
CLASSES = $(SOURCES:.java=.class)
MAIN_CLASS = Main

all:
	$(JAVAC) $(JAVAC_FLAGS) $(SOURCES)

clean:
	rm -f $(CLASSES)

run:
	$(JAVA) $(MAIN_CLASS)
