package org.example.patterns.CompositeDesigneFileSystem.solutionWithCompositeDesinge;

// Step 2: Leaf - File
 public class File implements FileSystemComponent {
 String fileName;

        public File(String name) {
             this.fileName = name;
        }

         @Override
         public void printContents() {
             System.out.println("File name: " + fileName);
         }
 }
