@echo off
mode 56,50
color a
javac -s ./src/ -d ./dist/ ./src/view/Main.java ./src/controller/ElogiosController.java
java -classpath dist view/Main