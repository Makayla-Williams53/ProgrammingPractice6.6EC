public class Main
{
    public static void main(String[] args)
    {
        int[][] table = new int[5][5];

        int count;
        int countDown;
        int countUp;

        //pattern 1
        count = 1;
        countDown = 4;
        countUp = 0;
        for(int row = 0; row < table.length; row++)
        {
            for(int col = 0; col < table[row].length && col <= countDown; col++)
            {
                table[row][col + countUp] = count;
                count++;
            }
            countDown--;
            countUp++;
        }

        countUp = -1;

        for(int row = 0; row < table.length; row++)
        {
            for(int col = 0; col < table[row].length && col <= countUp; col++)
            {
                table[row][col] = count;
                count++;
            }
            countUp++;
        }

        printTable(table);

        System.out.println();

        //pattern 2
        count = 1;
        countDown = 5;
        countUp = 0;

        for(int row = 0; row < table.length; row++)
        {
            for(int col = 0; col < countDown; col++)
            {
                table[row][col + row] = count;
                count++;
            }
            countDown--;

            for(int col = 0; col < countUp; col++)
            {
                table[row][col] = count;    
                count++;
            }
            countUp++;
        }

        printTable(table);

        System.out.println();

        //pattern 3
        int start = 0;
        int rowCount = start;
        int colCount = 0;
        count = 1;

        while(start < table.length)
        {
            while(rowCount >= 0)
            {
                table[rowCount][colCount] = count;
                count++;
                rowCount--;
                colCount++;
            }

            start++;
            rowCount = start;
            colCount = 0;
        }

        start = 1;
        rowCount = 4;
        colCount = start;

        while(start < table.length)
        {
            while(colCount <= 4)
            {
                table[rowCount][colCount] = count;
                rowCount--;
                colCount++;
                count++;
            }

            start++;
            rowCount = 4;
            colCount = start;
        }

        printTable(table);

    }//end main method

    public static void printTable(int[][] table)
    {
        for(int i = 0; i < table.length; i++)
        {
            for(int j = 0; j < table[i].length; j++)
            {
                System.out.print(table[i][j] + "\t");
            }
            System.out.println();
        }
    }
}//end class Main
