package Final;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Final_task {
    public static void main(String[] args){
        final int N = 11;
        String[][] field1 = new String[N][N];
        String[][] field2 = new String[N][N];
        String[][] field3 = new String[N][N];
        String[][] field4 = new String[N][N];
        PlayingField playingField1 = new PlayingField(field1);
        PlayingField playingField2 = new PlayingField(field2);
        PlayingField playingFieldForPlayer1 = new PlayingField(field3);
        PlayingField playingFieldForPlayer2 = new PlayingField(field4);

        whoFirst();

        addPlayField(field1);
        addPlayField(field3);
        System.out.println("Начнем расставлять корабли на поле. Второму игроку не смотреть!!!");
        System.out.println("Игровое поле: (по горизонтали Y, по вертикали Х, координаты начинаются с единицы)");
        System.out.println("После ввода координат корабля нажмите  клавишу Enter");
        playingField1.print();
        addShips4(field1,playingField1);
        addShips3(field1,playingField1);
        addShips2(field1,playingField1);
        addShips1(field1,playingField1);


        clearScreen();
        addPlayField(field2);
        addPlayField(field4);
        System.out.println("Начнем расставлять корабли на поле. Первому игроку не смотреть!!!");
        System.out.println("Игровое поле: (по горизонтали Y, по вертикали Х, координаты начинаются с единицы)");
        System.out.println("После ввода координат корабля нажмите  клавишу Enter");
        playingField2.print();
        addShips4(field2,playingField2);
        addShips3(field2,playingField2);
        addShips2(field2,playingField2);
        addShips1(field2,playingField2);


        clearScreen();

        gameRun(field1,playingField1,field2,playingField2,field3,playingFieldForPlayer1,field4,playingFieldForPlayer2);


    }
    public static void addPlayField(String[][] field){
        Cell cell = Cell.EMPTY_CELL;
        final int N = 11;
        for (int e = 0; e<N;e++){
            for (int y = 0; y<N;y++){
                field[e][y] = cell.toString();
                field[e][0] = e + " ";
            }
        }
        field[0][1] = "1️⃣";
        field[0][2] = "2️⃣";
        field[0][3] = "3️⃣ ";
        field[0][4] = "4️⃣";
        field[0][5] = "5️⃣";
        field[0][6] = "6️⃣ ";
        field[0][7] = "7️⃣";
        field[0][8] = "8️⃣";
        field[0][9] = "9️⃣";
        field[0][10] = "\uD83D\uDD1F";
        field[0][0] = "y>";


    }
    public static void ZoneShip_4(int x,int y, int x1, int y1,int x2,int y2,int x3, int y3,String[][] field){
        Cell cell = Cell.EMPTY_CELL;
        Cell cell2 = Cell.ZONE_SHIP_CELL;
        final int N = 11;
        ZoneShip_3(x,y,x1,y1,x2,y2,field);
        if((y3+1)<N && field[x3 - 1][y3 + 1].equals(cell.toString())){
            field[x3-1][y3+1] = cell2.toString();
        }
        if((y3+1)<N && field[x3][y3 + 1].equals(cell.toString())){
            field[x3][y3+1] = cell2.toString();
        }
        if((x3+1)<N && (y3 +1)<N && field[x3 + 1][y3 + 1].equals(cell.toString())){
            field[x3+1][y3+1] = cell2.toString();
        }
        if(field[x3 - 1][y3].equals(cell.toString())){
            field[x3-1][y3] = cell2.toString();
        }
        if((x3+1)<N && field[x3 + 1][y3].equals(cell.toString())){
            field[x3+1][y3] = cell2.toString();
        }
        if(field[x3 - 1][y3 - 1].equals(cell.toString())){
            field[x3-1][y3-1] = cell2.toString();
        }
        if(field[x3][y3 - 1].equals(cell.toString())){
            field[x3][y3-1] = cell2.toString();
        }
        if((x3 +1)<N && field[x3 + 1][y3 - 1].equals(cell.toString())){
            field[x3+1][y3-1] = cell2.toString();
        }

    }
    public static void ZoneShip_3(int x,int y, int x1, int y1,int x2,int y2,String[][] field){
        Cell cell = Cell.EMPTY_CELL;
        Cell cell2 = Cell.ZONE_SHIP_CELL;
        final int N =11;
        ZoneShip_2(x,y,x1,y1,field);
        if((y2+1)<N && field[x2 - 1][y2 + 1].equals(cell.toString())){
            field[x2-1][y2+1] = cell2.toString();
        }
        if((y2+1)<N && field[x2][y2 + 1].equals(cell.toString())){
            field[x2][y2+1] = cell2.toString();
        }
        if((x2+1)<N && (y2+1)<N && field[x2 + 1][y2 + 1].equals(cell.toString())) {
            field[x2+1][y2+1] = cell2.toString();
        }
        if(field[x2 - 1][y2].equals(cell.toString())){
            field[x2-1][y2] = cell2.toString();
        }
        if((x2+1)<N && field[x2 + 1][y2].equals(cell.toString())){
            field[x2+1][y2] = cell2.toString();
        }
        if(field[x2 - 1][y2 - 1].equals(cell.toString())){
            field[x2-1][y2-1] = cell2.toString();
        }
        if(field[x2][y2 - 1].equals(cell.toString())){
            field[x2][y2-1] = cell2.toString();
        }
        if((x2+1)<N && field[x2 + 1][y2 - 1].equals(cell.toString())){
            field[x2+1][y2-1] = cell2.toString();
        }

    }
    public static void ZoneShip_2(int x,int y, int x1, int y1,String[][] field){
        Cell cell = Cell.EMPTY_CELL;
        Cell cell2 = Cell.ZONE_SHIP_CELL;
        final int N = 11;
        ZoneShip_1(x,y,field);
        if((y1+1)<N && field[x1 - 1][y1 + 1].equals(cell.toString())){
            field[x1-1][y1+1] = cell2.toString();
        }
        if((y1 +1)<N && field[x1][y1 + 1].equals(cell.toString())){
            field[x1][y1+1] = cell2.toString();
        }
        if((x1+1)<N && (y1+1) < N && field[x1 + 1][y1 + 1].equals(cell.toString())){
            field[x1+1][y1+1] = cell2.toString();
        }
        if(field[x1 - 1][y1].equals(cell.toString())){
            field[x1-1][y1] = cell2.toString();
        }
        if((x1+1)<N && field[x1 + 1][y1].equals(cell.toString())){
            field[x1+1][y1] = cell2.toString();
        }
        if(field[x1 - 1][y1 - 1].equals(cell.toString())){
            field[x1-1][y1-1] = cell2.toString();
        }
        if(field[x1][y1 - 1].equals(cell.toString())){
            field[x1][y1-1] = cell2.toString();
        }
        if((x1+1)<N && field[x1 + 1][y1 - 1].equals(cell.toString())){
            field[x1+1][y1-1] = cell2.toString();
        }

    }
    public static void ZoneShip_1(int x,int y, String[][] field){
        Cell cell = Cell.EMPTY_CELL;
        Cell cell2 = Cell.ZONE_SHIP_CELL;
        final int N = 11;
        if((y+1)<N && field[x - 1][y + 1].equals(cell.toString())){
            field[x-1][y+1] = cell2.toString();
        }
        if((y+1)<N && field[x][y + 1].equals(cell.toString())){
            field[x][y+1] = cell2.toString();
        }
        if((x+1)<N && (y+1)<N && field[x + 1][y + 1].equals(cell.toString())){
            field[x+1][y+1] = cell2.toString();
        }
        if(field[x - 1][y].equals(cell.toString())){
            field[x-1][y] = cell2.toString();
        }
        if((x+1) <N && field[x + 1][y].equals(cell.toString())){
            field[x+1][y] = cell2.toString();
        }
        if(field[x - 1][y - 1].equals(cell.toString())){
            field[x-1][y-1] = cell2.toString();
        }
        if(field[x][y - 1].equals(cell.toString())){
            field[x][y-1] = cell2.toString();
        }
        if((x+1)<N && field[x + 1][y - 1].equals(cell.toString())){
            field[x+1][y-1] = cell2.toString();
        }
    }
    public static void addShips4(String[][] field,PlayingField playingField) {
        Cell cell1 = Cell.SHIP_CELL;

        try {


            System.out.println("Введи координаты 4-х палубного корабля (формат x1,y1;x2,y2;x3,y3;x4,y4)");
            Scanner scanner = new Scanner(System.in);
            scanner.useDelimiter("[,;\"\\s–]+");
            int x14 = scanner.nextInt();
            int y14 = scanner.nextInt();
            int x24 = scanner.nextInt();
            int y24 = scanner.nextInt();
            int x34 = scanner.nextInt();
            int y34 = scanner.nextInt();
            int x44 = scanner.nextInt();
            int y44 = scanner.nextInt();
            Ship_4 ship_4 = new Ship_4(x14, y14, x24, y24, x34, y34, x44, y44, playingField);
            field[x14][y14] = cell1.toString();
            field[x24][y24] = cell1.toString();
            field[x34][y34] = cell1.toString();
            field[x44][y44] = cell1.toString();
            ZoneShip_4(x14, y14, x24, y24, x34, y34, x44, y44, field);
            playingField.print();

        } catch (ArrayIndexOutOfBoundsException | InputMismatchException e) {
            System.out.println("Вы ввели некорректные координаты ( введите числа от 1 до 10 включительно");
            addShips4(field, playingField);
        } catch (ValidShip n) {
            System.out.println("Не валидный корабль. Ячейки должны идти последовательно по вертикали или горизонтали");
            addShips4(field, playingField);
        } catch (EmptyCell s) {
            System.out.println("Вы разместили ячейку корабля на занятой клетке ");
            addShips4(field, playingField);
        }
    }

    public static void addShips3(String[][] field,PlayingField playingField) {
        Cell cell1 = Cell.SHIP_CELL;
        Cell cell2 = Cell.ZONE_SHIP_CELL;
        try {

            System.out.println("Введи координаты первого 3-х палубного корабля (формат x1,y1;x2,y2;x3,y3)");
            Scanner scanner1 = new Scanner(System.in);
            scanner1.useDelimiter("[.,:;\"\\s–]+");
            int x13 = scanner1.nextInt();
            int y13 = scanner1.nextInt();
            int x23 = scanner1.nextInt();
            int y23 = scanner1.nextInt();
            int x33 = scanner1.nextInt();
            int y33 = scanner1.nextInt();
            if (field[x13][y13].equals(cell2.toString()) || field[x23][y23].equals(cell2.toString()) || field[x33][y33].equals(cell2.toString())) {
                throw new ShipZone();
            }
            Ship_3 ship_3_1 = new Ship_3(x13, y13, x23, y23, x33, y33, playingField);
            field[x13][y13] = cell1.toString();
            field[x23][y23] = cell1.toString();
            field[x33][y33] = cell1.toString();
            ZoneShip_3(x13, y13, x23, y23, x33, y33, field);
            playingField.print();

            System.out.println("Введи координаты второго 3-х палубного корабля (формат x1,y1;x2,y2;x3,y3)");
            Scanner scanner2 = new Scanner(System.in);
            scanner2.useDelimiter("[.,:;\"\\s–]+");
            int x131 = scanner2.nextInt();
            int y131 = scanner2.nextInt();
            int x231 = scanner2.nextInt();
            int y231 = scanner2.nextInt();
            int x331 = scanner2.nextInt();
            int y331 = scanner2.nextInt();
            if (field[x131][y131].equals(cell2.toString()) || field[x231][y231].equals(cell2.toString()) || field[x331][y331].equals(cell2.toString())) {
                throw new ShipZone();
            }
            Ship_3 ship_3_2 = new Ship_3(x131, y131, x231, y231, x331, y331, playingField);
            field[x131][y131] = cell1.toString();
            field[x231][y231] = cell1.toString();
            field[x331][y331] = cell1.toString();
            ZoneShip_3(x131, y131, x231, y231, x331, y331, field);
            playingField.print();
        } catch (ArrayIndexOutOfBoundsException | InputMismatchException e) {
            System.out.println("Вы ввели некорректные координаты ( введите числа от 1 до 10 включительно");
            addShips3(field,playingField);

        } catch (ValidShip n) {
            System.out.println("Не валидный корабль. Ячейки должны идти последовательно по вертикали или горизонтали");
            addShips3(field,playingField);
        } catch (EmptyCell s) {
            System.out.println("Вы разместили ячейку корабля на занятой клетке ");
            addShips3(field,playingField);
        } catch (ShipZone shipZone) {
            System.out.println("Размещаемый корабль не должен касаться других кораблей сторонами и углами");
            addShips3(field,playingField);
        }
    }
    public static void addShips2(String[][] field,PlayingField playingField) {
        Cell cell1 = Cell.SHIP_CELL;
        Cell cell2 = Cell.ZONE_SHIP_CELL;
        try {

            System.out.println("Введи координаты первого 2-х палубного корабля (формат x1,y1;x2,y2)");
            Scanner scanner3 = new Scanner(System.in);
            scanner3.useDelimiter("[.,:;\"\\s–]+");
            int x12 = scanner3.nextInt();
            int y12 = scanner3.nextInt();
            int x22 = scanner3.nextInt();
            int y22 = scanner3.nextInt();
            if (field[x12][y12].equals(cell2.toString()) || field[x22][y22].equals(cell2.toString())) {
                throw new ShipZone();
            }
            Ship_2 ship_2_1 = new Ship_2(x12, y12, x22, y22, playingField);
            field[x12][y12] = cell1.toString();
            field[x22][y22] = cell1.toString();
            ZoneShip_2(x12, y12, x22, y22, field);
            playingField.print();

            System.out.println("Введи координаты второго 2-х палубного корабля (формат x1,y1;x2,y2)");
            Scanner scanner4 = new Scanner(System.in);
            scanner4.useDelimiter("[.,:;\"\\s–]+");
            int x121 = scanner4.nextInt();
            int y121 = scanner4.nextInt();
            int x221 = scanner4.nextInt();
            int y221 = scanner4.nextInt();
            if (field[x121][y121].equals(cell2.toString()) || field[x221][y221].equals(cell2.toString())) {
                throw new ShipZone();
            }
            Ship_2 ship_2_2 = new Ship_2(x121, y121, x221, y221, playingField);
            field[x121][y121] = cell1.toString();
            field[x221][y221] = cell1.toString();
            ZoneShip_2(x121, y121, x221, y221, field);
            playingField.print();

            System.out.println("Введи координаты третьего 2-х палубного корабля (формат x1,y1;x2,y2)");
            Scanner scanner5 = new Scanner(System.in);
            scanner5.useDelimiter("[.,:;\"\\s–]+");
            int x122 = scanner5.nextInt();
            int y122 = scanner5.nextInt();
            int x222 = scanner5.nextInt();
            int y222 = scanner5.nextInt();
            if (field[x122][y122].equals(cell2.toString()) || field[x222][y222].equals(cell2.toString())) {
                throw new ShipZone();
            }
            Ship_2 ship_2_3 = new Ship_2(x122, y122, x222, y222, playingField);
            field[x122][y122] = cell1.toString();
            field[x222][y222] = cell1.toString();
            ZoneShip_2(x122, y122, x222, y222, field);
            playingField.print();
        } catch (ArrayIndexOutOfBoundsException | InputMismatchException e) {
            System.out.println("Вы ввели некорректные координаты ( введите числа от 1 до 10 включительно");
            addShips2(field, playingField);
        } catch (ValidShip n) {
            System.out.println("Не валидный корабль. Ячейки должны идти последовательно по вертикали или горизонтали");
            addShips2(field, playingField);
        } catch (EmptyCell s) {
            System.out.println("Вы разместили ячейку корабля на занятой клетке ");
            addShips2(field, playingField);
        } catch (ShipZone shipZone) {
            System.out.println("Размещаемый корабль не должен касаться других кораблей сторонами и углами");
            addShips2(field, playingField);
        }
    }
    public static void addShips1(String[][] field,PlayingField playingField) {
        Cell cell1 = Cell.SHIP_CELL;
        Cell cell2 = Cell.ZONE_SHIP_CELL;
        try {


            System.out.println("Введи координаты первого однопалубного корабля (формат x1,y1)");
            Scanner scanner6 = new Scanner(System.in);
            scanner6.useDelimiter("[.,:;\"\\s–]+");
            int x11 = scanner6.nextInt();
            int y11 = scanner6.nextInt();
            if (field[x11][y11].equals(cell2.toString())) {
                throw new ShipZone();
            }
            Ship_1 ship_1_1 = new Ship_1(x11, y11, playingField);
            field[x11][y11] = cell1.toString();
            ZoneShip_1(x11, y11, field);
            playingField.print();

            System.out.println("Введи координаты второго однопалубного корабля (формат x1,y1)");
            Scanner scanner7 = new Scanner(System.in);
            scanner7.useDelimiter("[.,:;\"\\s–]+");
            int x111 = scanner7.nextInt();
            int y111 = scanner7.nextInt();
            if (field[x111][y111].equals(cell2.toString())) {
                throw new ShipZone();
            }
            Ship_1 ship_1_2 = new Ship_1(x111, y111, playingField);
            field[x111][y111] = cell1.toString();
            ZoneShip_1(x111, y111, field);
            playingField.print();

            System.out.println("Введи координаты третьего однопалубного корабля (формат x1,y1)");
            Scanner scanner8 = new Scanner(System.in);
            scanner8.useDelimiter("[.,:;\"\\s–]+");
            int x112 = scanner8.nextInt();
            int y112 = scanner8.nextInt();
            if (field[x112][y112].equals(cell2.toString())) {
                throw new ShipZone();
            }
            Ship_1 ship_1_3 = new Ship_1(x112, y112, playingField);
            field[x112][y112] = cell1.toString();
            ZoneShip_1(x112, y112, field);
            playingField.print();

            System.out.println("Введи координаты четвертого однопалубного корабля (формат x1,y1)");
            Scanner scanner9 = new Scanner(System.in);
            scanner9.useDelimiter("[.,:;\"\\s–]+");
            int x113 = scanner9.nextInt();
            int y113 = scanner9.nextInt();
            if (field[x113][y113].equals(cell2.toString())) {
                throw new ShipZone();
            }
            Ship_1 ship_1_4 = new Ship_1(x113, y113, playingField);
            field[x113][y113] = cell1.toString();
            ZoneShip_1(x113, y113, field);


        } catch (ArrayIndexOutOfBoundsException | InputMismatchException e) {
            System.out.println("Вы ввели некорректные координаты ( введите числа от 1 до 10 включительно");
            addShips1(field, playingField);
        } catch (ShipZone shipZone) {
            System.out.println("Размещаемый корабль не должен касаться других кораблей сторонами и углами");
            addShips1(field, playingField);
        }
    }



    public static void clearScreen(){
        for (int i =0;i<50;i++){
            System.out.println("  ");
        }
    }
    public static void whoFirst(){
        System.out.println("Введите ваши имена через пробел");
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("[,;\"\\s–]+");
        String name1 = scanner.next();
        String name2 = scanner.next();
        String[] names = {name1,name2};
        Random random = new Random();
        int pos = random.nextInt(names.length);
        System.out.println("Игрок с именем " + names[pos] + " размещает корабли и ходит первым");

    }
    public static void move(String[][] field,PlayingField playingField,String[][] fieldForAnotherPlayer, PlayingField playingFieldForAnotherPlayer) {

        System.out.println("Введите координаты для удара по полю соперника (формат x1,y1)");
        Scanner scanner10 = new Scanner(System.in);
        scanner10.useDelimiter("[,;\"\\s–]+");
        Cell cell3 = Cell.DEMAGE_CELL;
        Cell cell1 = Cell.SHIP_CELL;
        Cell cell5 = Cell.HIT_CELL;
        try {
            int x = scanner10.nextInt();
            int y = scanner10.nextInt();
            while (field[x][y].equals(cell1.toString())) {

                if (searchShipCell(field, x, y)) {
                    field[x][y] = cell3.toString();
                    fieldForAnotherPlayer[x][y] = cell3.toString();
                    System.out.println("Попадание!");
                    playingFieldForAnotherPlayer.print();
                    System.out.println("Введите координаты для удара по полю соперника (формат x1,y1)");
                    x = scanner10.nextInt();
                    y = scanner10.nextInt();


                }
                else if (!searchShipCell(field, x, y)) {
                    System.out.println("Утопил!!!");
                    field[x][y] = cell3.toString();
                    fieldForAnotherPlayer[x][y] = cell3.toString();
                    ZoneShip_1(x,y,fieldForAnotherPlayer);
                    playingFieldForAnotherPlayer.print();
                    if (playingFieldWithShips(field)) {
                        System.out.println("Введите координаты для удара по полю соперника (формат x1,y1)");
                        x = scanner10.nextInt();
                        y = scanner10.nextInt();
                    } else return;
                } else return;


            }
            if (!field[x][y].equals(cell1.toString()) && playingFieldWithShips(field)) {
                fieldForAnotherPlayer[x][y] = cell5.toString();
                playingFieldForAnotherPlayer.print();
                System.out.println("Мимо, ход переходит следующему игроку");

            }
            if(x>11 || x<1 || y>11 || y<1){
                throw new ArrayIndexOutOfBoundsException();
            }
        }
        catch (ArrayIndexOutOfBoundsException | InputMismatchException e){
            System.out.println("Вы ввели некорректные координаты");
            move(field,playingField,fieldForAnotherPlayer,playingFieldForAnotherPlayer);
        }



    }

    public static boolean searchShipCell(String[][] field, int x, int y) {
        Cell cell1 = Cell.SHIP_CELL;
        final int N = 11;

        if((y+1)<N && field[x][y + 1].equals(cell1.toString()) ){
            return true;}
        if(field[x - 1][y].equals(cell1.toString())){
            return true;}
        if((x+1) <N && field[x + 1][y].equals(cell1.toString())){
            return true;}
        if(field[x][y - 1].equals(cell1.toString())){
            return true;}

        return (x + 1) < N && field[x + 1][y - 1].equals(cell1.toString());
    }

    public static boolean playingFieldWithShips(String[][] field){
        Cell cell1 = Cell.SHIP_CELL;
        for (int d = 0; d<11;d++){
            for (int s = 0;s<11;s++){
                if (field[d][s].equals(cell1.toString())){
                    return true;
                }
            }
        }
        return false;
    }
    public static void gameRun (String[][] field1,PlayingField playingField1,String[][] field2,PlayingField playingField2,String[][] fieldForPlayer1,PlayingField playingFieldForPlayer1, String[][] fieldForPlayer2,PlayingField playingFieldForPlayer2) {

            while (true) {
                if (playingFieldWithShips(field1)) {
                    move(field2, playingField2,fieldForPlayer1,playingFieldForPlayer1);
                }
                if (playingFieldWithShips(field2)) {
                    move(field1, playingField1,fieldForPlayer2,playingFieldForPlayer2);
                }
                if (!playingFieldWithShips(field1)) {
                    System.out.println("Игра окончена, выиграл второй игрок");
                    return;
                }
                if (!playingFieldWithShips(field2)) {
                    System.out.println("Игра окончена, выиграл первый игрок");
                    return;
                }

            }
        }

    }
