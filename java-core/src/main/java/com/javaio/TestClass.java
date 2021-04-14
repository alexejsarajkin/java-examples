package com.javaio;

import java.io.IOException;

public class TestClass {
    private static final String FILE_NAME = "GradeBook.txt";
    private static final String FILE_NAME_BYTE = "GradeBookByte.txt";
    private static final String BINARY_FILE = "Students.bin";
    private static final String BUFFERED_FILE = "Buffered.bin";


    public static void main(String[] args) throws IOException {
//        SortedMap<AverageStudentGrade, Set<SubjectGrade>> grades = TreeMapRunner.createGrades();
//        Reader reader = new Reader();
//        Writer writer = new Writer();
//        writer.writeFile(grades, FILE_NAME);
//        reader.readFile(FILE_NAME);
//
//
//        byte[] fileContent = Files.readAllBytes(Paths.get(FILE_NAME));
//
//        for (Byte b:fileContent
//             ) {
//            System.out.println(b);
//        }

        byte[] bytes = "com.hello world".getBytes();

        for (Byte b : bytes
        ) {
            System.out.println(b);
        }

        String s = new String(bytes);

        System.out.println(s);


//       try (FileInputStream reader1 = new FileInputStream(FILE_NAME);
//             FileOutputStream writer1 = new FileOutputStream(FILE_NAME_BYTE)) {
//           System.out.println(IOUtils.toByteArray(reader1));
//           int c;
//            while ((c = reader1.read())!=-1){
//                System.out.println(c);
//                writer1.write(c);
//            }
//        }


    }
}
