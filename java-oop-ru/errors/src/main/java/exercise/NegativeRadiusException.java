package exercise;

// BEGIN
class NegativeRadiusException extends Exception {
    String msg;
    NegativeRadiusException(String msg) {
        this.msg = msg;
    }
}
// END
