package com.ocp.examtopics;

public class Question99 {
    public static void main(String[] args) {
        Resource resource = new Resource();
        try {
            resource.open();
            resource.close();
        } catch (Exception e) {
            System.out.println("exception1 ");
        }

//        try (resource =new Resource()){ // line 1
//            resource.open();
//        } catch(Exception e){
//            System.out.println("exception1 ");
//        }
    }
}

class Resource implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("close ");
    }

    public void open() {
        System.out.println("open ");
    }
}

// A compilation error occurs at line n1.
