/*
 * DannyFS
 * JDATools - JDAColors
 * 
 * Version 1.0
 * 
 * Description:
 * A simple way to use colors for embeds, roles, and much more!
 * 
 */


import java.awt.Color;

public class JDAColors {
   /**
    * The color aqua in hexadecimal form
    * @since 1.0
    */
   public static final int AQUA = 0x1abc9c;
   
   /**
    * The color aqua in hexadecimal form
    * @since 1.0
    */
   public static final int BLACK = 0x000000;
   
   /**
    * The color blue in hexadecimal form
    * @since 1.0
    */
   public static final int BLUE = 0x3498db;
   
   /**
    * The color blurple in hexadecimal form
    * @since 1.0
    */
   public static final int BLURPLE = 0x7289da;
   
   /**
    * The color dark blue in hexadecimal form
    * @since 1.0
    */
   public static final int DARK_BLUE = 0x206694;
   
   /**
    * The color dark gold in hexadecimal form
    * @since 1.0
    */
   public static final int DARK_GOLD = 0xc27c0e;
   
   /**
    * The color dark gray in hexadecimal form
    * @since 1.0
    */
   public static final int DARK_GRAY = 0x607d8b;
   
   /**
    * The color dark green in hexadecimal form
    * @since 1.0
    */
   public static final int DARK_GREEN = 0x1f8b4c;
   
   /**
    * The color dark grey in hexadecimal form
    * @since 1.0
    */
   public static final int DARK_GREY = 0x607d8b;
   
   /**
    * The color dark magenta in hexadecimal form
    * @since 1.0
    */
   public static final int DARK_MAGENTA = 0xad1457;
   
   /**
    * The color dark orange in hexadecimal form
    * @since 1.0
    */
   public static final int DARK_ORANGE = 0xa84300;
   
   /**
    * The color dark purple in hexadecimal form
    * @since 1.0
    */
   public static final int DARK_PURPLE = 0x71368a;
   
   /**
    * The color dark red in hexadecimal form
    * @since 1.0
    */
   public static final int DARK_RED = 0x992d22;
   
   /**
    * The color dark teal in hexadecimal form
    * @since 1.0
    */
   public static final int DARK_TEAL = 0x11806a;
   
   /**
    * The default color in hexadecimal form
    * @since 1.0
    */
   public static final int DEFAULT = 0x3498db;
   
   /**
    * The color gold in hexadecimal form
    * @since 1.0
    */
   public static final int GOLD = 0xf1c40f;
   
   /**
    * The color green in hexadecimal form
    * @since 1.0
    */
   public static final int GREEN = 0x2ecc71;
   
   /**
    * The color greyple in hexadecimal form
    * @since 1.0
    */
   public static final int GREYPLE = 0x99aab5;
   
   /**
    * The color light gray in hexadecimal form
    * @since 1.0
    */
   public static final int LIGHT_GRAY = 0x979c9f;
   
   /**
    * The color light grey in hexadecimal form
    * @since 1.0
    */
   public static final int LIGHT_GREY = 0x979c9f;
   
   /**
    * The color magenta in hexadecimal form
    * @since 1.0
    */
   public static final int MAGENTA = 0xe91e63;
   
   /**
    * The color orange in hexadecimal form
    * @since 1.0
    */
   public static final int ORANGE = 0xe67e22;
   
   /**
    * The color pink in hexadecimal form
    * @since 1.0
    */
   public static final int PINK = 0xe91e63;
   
   /**
    * The color purple in hexadecimal form
    * @since 1.0
    */
   public static final int PURPLE = 0x9b59b6;
   
   /**
    * The color red in hexadecimal form
    * @since 1.0
    */
   public static final int RED = 0xe74c3c;
   
   /**
    * The color teal in hexadecimal form
    * @since 1.0
    */
   public static final int TEAL = 0x3498db;

   
   /**
    * Converts rgb values to int
    * @param     red : the red component of the color
    * @param     green : the green component of the color
    * @param     blue : the blue component of the color
    * @return    an int, equivalent to a hexidecimal value
    * @since     1.0
    */
   public static int rgb(int red, int green, int blue) {
      return 65536 * red + 256 * green + blue;
   }
   
   
   
   /**
    * Converts hexidecimal integer values to rgb
    * @param     hex : the hexidecimal color value
    * @return    an array of int values {r, g, b}
    * @since     1.0
    */
   public static int[] hexToRGB(int hex) {
      return new int[] {(hex & 0xFF0000) >> 16, (hex & 0xFF00) >> 8, hex & 0xFF};
   }
   
   
   /**
    * Converts awt colors to int
    * @param     color : the java awt color
    * @return    an int, equivalent to hexidecimal value
    * @since     1.0
    */
   public static int colorToHex(Color color) {
      return rgb(color.getRed(), color.getGreen(), color.getBlue());
   }
}
