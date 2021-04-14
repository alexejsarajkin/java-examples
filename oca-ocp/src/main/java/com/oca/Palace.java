package com.oca;

class OpenDoorException extends Exception {
}

class CableSnapException extends OpenDoorException {
}

public class Palace {
    public void openDrawbridge() throws Exception {
        try {
            throw new Exception("Problem");
        } catch (CableSnapException ex) {
            throw new OpenDoorException();
        } catch (OpenDoorException e) {
            try {
                throw new OpenDoorException();
            } catch (Exception exq) {
            } finally {
                System.out.println("Almost done");
            }
        } finally {
            throw new RuntimeException("Unending problem");
        }
    }

    public static void main(String[] moat) throws Exception {
        new Palace().openDrawbridge();
    }
}
