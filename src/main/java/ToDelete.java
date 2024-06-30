class ToDelete {
int tx = 10;
int ty = 20;
ToDelete(int tx, int ty) {
    System.out.println(tx == ty);
}

public static void main(String[] args) {
ToDelete toDelete = new ToDelete(tx, ty);
}
}
