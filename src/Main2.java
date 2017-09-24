class Main2 {
    public static void main(String[] args) throws java.lang.Exception {
        int ch;
        int counter = 0;
        String str = "";
        while ((ch = System.in.read()) != '\n') {
            str += (char) ch;
        }

        for (int i = 0; i < str.length(); i++) {
            char index = str.charAt(i);

            if (index == '1') {
                counter += 2;
            } else if (index == '4') {
                counter += 4;
            } else if (index == '7') {
                counter += 3;
            } else if (index == '8') {
                counter += 7;
            } else if (index == '9' || index == '0' || index == '6') {
                counter += 6;
            } else {
                counter += 5;
            }
        }
        System.out.println(counter);
    }
}