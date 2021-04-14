package com.ocp.host.igor.stage3;

public class Problem86 {
    public static void main(String[] args) {
        try (Bid bid = new Bid();
             Auction auc = new Auction()) {
            bid.placeBid();
            auc.acceptBid();
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
}


class Bid implements AutoCloseable {
    public void close() throws Exception {
        System.out.print("Bid closed. ");
    }

    public void placeBid() throws Exception {
        System.out.print("Placing bid. ");
        throw new Exception("Unable to place bid. ");
    }
}

class Auction implements AutoCloseable {
    public void close() throws Exception {
        System.out.print("Auction closed. ");
    }

    public void acceptBid() {
        System.out.print("Bid accepted.");
    }
}