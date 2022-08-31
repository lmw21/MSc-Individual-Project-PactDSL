# MSc-Individual-Project-PactDSL

# PactDSL
Pact is a  domain-specific programming language (“DSL”) that can be used to represent the terms of anatural language contract accurately,
and in a machine-readable form. The Pact language consists of a small number of core components that are commonto many contracts.  
These components are divided into types of each component,which can be combined and customised by a Pact user so as to enable the 
representation of a complex term of a contract.  The Pact language can be used within aneditor to write contracts as standalone programs.

# Running Pact
To run Pact:
1. Download the Eclipse IDE with Xtext from https://www.eclipse.org/Xtext/.
2. Clone the five Pact project folders from this repository. 
3. Open Eclipse and select File/Open Projects from File System. Import the five Pact project folders. 
4. Using the Package Explorer view navigate to imperialmsc.lmw21.pactdsl/src/imperialmsc.lmw21.pactdsl/PactDSL.xtext. 
5. Right click the text and select Run as/1. Generate Xtext Artifacts. "Done" should show in the Console View.
6. Choose "Yes" if asked "Do you want to convert this to an Xtext project?".
7. Using the Package Explorer view, find the src-gen directory in each project folder. Right click on each src-gen directory and select Build Path/Use as Source Folder.
8. To run the Pact editor, right click on imperialmsc.lmw21.pactdsl and select Run As/1. Eclipse Application. A new Eclipse window will open. 
9. Select File/New/Java Project and create a new project.
10. Within the src directory of this project, create a new file and name it using the ".PactDSL" extension.
11. Choose "Yes" if asked "Do you want to convert this to an Xtext project?".
12. You can now use the editor to create contracts written in the Pact language. Press Ctrl + Space for content assistance. 
