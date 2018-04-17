package com.alhaj.calculator;

public class Converter {
    public String decTobin (int inDec)
    {
        String inBin = "";
        int binary[] = new int[40];
        int index = 0;
        while(inDec > 0){
            binary[index++] = inDec%2;
            inDec = inDec/2;
        }
        for(int i = index-1;i >= 0;i--){
            inBin += binary[i]+"";
        }

        return inBin;
        //return Integer.toBinaryString(inDec);
    }
    public String decTohex (int inDec)
    {
        final int sizeOfIntInHalfBytes = 8;
        final char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7',
                '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        final int numberOfBitsInAHalfByte = 4;
        final int halfByte = 0x0F;
        StringBuilder hexBuilder = new StringBuilder(sizeOfIntInHalfBytes);
        hexBuilder.setLength(sizeOfIntInHalfBytes);
        for (int i = sizeOfIntInHalfBytes - 1; i >= 0; --i)
        {
            int j = inDec & halfByte;
            hexBuilder.setCharAt(i, hexDigits[j]);
            inDec >>= numberOfBitsInAHalfByte;
        }
        return hexBuilder.toString();
        //  return  Integer.toHexString(inDec);
    }
    public String decToOct (int inDec)
    {
        int rem;
        String octal="";
        char octalchars[]={'0','1','2','3','4','5','6','7'};

        while(inDec>0)
        {
            rem=inDec%8;
            octal=octalchars[rem]+octal;
            inDec=inDec/8;
        }
        return octal;
        //  return Integer.toOctalString(inDec);
    }

}
