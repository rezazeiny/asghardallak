public class Field {
    private static int count = 0;

    public Field(Coordination coordination, Earth earth) {
        count++;
        for (int i = coordination.getX() - 1; i < coordination.getX() + 1; i++) {
            for (int j = coordination.getY() - 1; j < coordination.getY() + 1; j++) {
                if (i < 0 || i > earth.getLength() || j < 0 || j > earth.getWidth())
                    continue;
                earth.getMap()[i][j].setId(count);
                earth.getMap()[i][j].setLocation("Field");
            }
        }
    }
}