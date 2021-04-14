package com.ocp.host.igor.stage3;

public class Problem13 {
    static final class WordPress {
        public void login() {
        }
    }

    static class Post {
        public final void write(int words, int pix) {
        }

        public void uploadMedia() {
        }
    }

    static class FrontPage {
        private Post p = new Post();
        private final String subj = "OCA & OCP Prep Tools";

        public void compose() {
            p.write(1200, 2);
        }
    }

    static class StickyPost extends Post {
//        public void write(int numberOfWords, int numberOfPix) {
//        }

        public void publish() {
        }
    }
}

