package com.company;

public class AlignCenter implements AlignStrategy{
    public void render(Paragraph paragraph, Context context)
    {
        String content = paragraph.getText();

        int offsetLength= context.length() - content.length();
        String offset_left="";
        String offset_right="";

        for(int i=0;i<offsetLength/2;i++)
            offset_left=offset_left+"-";

        for(int i=0;i<offsetLength/2;i++)
        {
            offset_right = offset_right+"-";
        }

        System.out.println(offset_left+content+offset_right);
    }
}
