package com.urtrends.jersy.util;

/**
 * Created by ZUBCARZ on 2/22/2016.
 */
public class Globals {

    private static Globals instance = null;

    protected Globals() {
        // Exists only to defeat instantiation.
    }

    public static Globals getInstance() {
        if (instance == null) {
            instance = new Globals();
        }
        return instance;
    }

    public String getBody(String text) {


        String BODY = ""
                + "<html xmlns='http://www.w3.org/1999/xhtml' xmlns:v='urn:schemas-microsoft-com:vml' xmlns:o='urn:schemas-microsoft-com:office:office'>"
                + "<head>"
                + "<meta http-equiv='Content-Type' content=\"text/html;charset=utf8\">"
                + "<style type='text/css'>"
                + "body, .mainTable {"
                + "	height: 100% !important;"
                + "	width: 100% !important;"
                + "	margin: 0;"
                + "	padding: 0;"
                + "}"
                + "img, a img {"
                + "	border: 0;"
                + "	outline: none;"
                + "	text-decoration: none;"
                + "}"
                + ".imageFix {"
                + "	display: block;"
                + "}"
                + "table, td {"
                + "	border-collapse: collapse;"
                + "	mso-table-lspace: 0pt;"
                + "	mso-table-rspace: 0pt;"
                + "}"
                + "p {"
                + "	margin: 0;"
                + "	padding: 0;"
                + "	margin-bottom: 0;"
                + "}"
                + ".ReadMsgBody {"
                + "	width: 100%;"
                + "}"
                + ".ExternalClass {"
                + "	width: 100%;"
                + "}"
                + ".ExternalClass, .ExternalClass p, .ExternalClass span, .ExternalClass font, .ExternalClass td, .ExternalClass div {"
                + "	line-height: 100%;"
                + "}"
                + "img {"
                + "	-ms-interpolation-mode: bicubic;"
                + "}"
                + "body, table, td, p, a, li, blockquote {"
                + "	-ms-text-size-adjust: 100%;"
                + "	-webkit-text-size-adjust: 100%;"
                + "}"
                + "</style>"
                + "</head>"
                + "<body scroll='auto' style='padding:0; margin:0; FONT-SIZE: 12px; FONT-FAMILY: Arial, Helvetica, sans-serif; cursor:auto; background:White'>"
                + "<table class='mainTable' cellspacing='0' cellpadding='0' width='100%' bgcolor='white'>"
                + "  <tbody>"
                + "    <tr>"
                + "      <td style='FONT-SIZE: 0px; HEIGHT: 20px; LINE-HEIGHT: 0'>&nbsp;</td>"
                + "    </tr>"
                + "    <tr>"
                + "      <td valign='top'><table style='WIDTH: 402px; MARGIN: 0px auto; min-width: 402px;' cellspacing='0' cellpadding='0' width='402' align='center' border='0'>"
                + "          <tbody>"
                + "            <tr>"
                + "              <td style='BORDER-TOP: medium none; BORDER-RIGHT: medium none; BORDER-BOTTOM: medium none; PADDING-BOTTOM: 0px; PADDING-TOP: 0px; PADDING-LEFT: 0px; BORDER-LEFT: medium none; PADDING-RIGHT: 0px; BACKGROUND-COLOR: #feffff'><table style='WIDTH: 100%' cellspacing='0' cellpadding='0' align='left'>"
                + "                  <tbody>"
                + "                    <tr style='HEIGHT: 109px'>"
                + "                      <td style='BORDER-TOP: medium none; BORDER-RIGHT: medium none; WIDTH: 100%; VERTICAL-ALIGN: middle; BORDER-BOTTOM: medium none; PADDING-BOTTOM: 0px; TEXT-ALIGN: center; PADDING-TOP: 0px; PADDING-LEFT: 0px; BORDER-LEFT: medium none; PADDING-RIGHT: 0px; BACKGROUND-COLOR: #feffff'><table cellspacing='0' cellpadding='0' align='center' border='0'>"
                + "                          <tbody>"
                + "                            <tr>"
                + "                              <td style='PADDING-BOTTOM: 2px; PADDING-TOP: 2px; PADDING-LEFT: 2px; PADDING-RIGHT: 2px' align='center'><table cellspacing='0' cellpadding='0' border='0'>"
                + "                                  <tbody>"
                + "                                    <tr>"
                + "                                      <td style='BORDER-TOP: medium none; BORDER-RIGHT: medium none; BORDER-BOTTOM: medium none; BORDER-LEFT: medium none; BACKGROUND-COLOR: transparent;'><p style='MARGIN-BOTTOM: 15px;      mso-line-height-rule: exactly;text-align: CENTER;' align='left'> <font style='FONT-SIZE: 20px; FONT-FAMILY: Arial, Helvetica, sans-serif;COLOR: #0056A3;border-bottom: 1px;border-bottom-style: solid;      border-bottom-color: #CCC;      padding-bottom: 3PX;'>Your design is approved</font><br>"
                + "                                        </p>"
                + "                                        <p style='MARGIN-BOTTOM: 15px; FONT-SIZE: 25px; FONT-FAMILY: Arial, Helvetica, sans-serif; COLOR: #616161; MARGIN-TOP: 0px; BACKGROUND-COLOR: transparent; mso-line-height-rule: exactly;text-align: CENTER;FONT-WEIGHT: 700;' align='left'>" + text + "</p>"
                + "                                     </tr>"
                + "                                  </tbody>"
                + "                                </table></td>"
                + "                            </tr>"
                + "                          </tbody>"
                + "                        </table></td>"
                + "                    </tr>"
                + "                  </tbody>"
                + "                </table></td>"
                + "            </tr>"
                + "            <tr>"
                + "              <td style='BORDER-TOP: medium none; BORDER-RIGHT: medium none; BORDER-BOTTOM: medium none; PADDING-BOTTOM: 0px; PADDING-TOP: 0px; PADDING-LEFT: 0px; BORDER-LEFT: medium none; PADDING-RIGHT: 0px; BACKGROUND-COLOR: transparent'><table style='WIDTH: 100%' cellspacing='0' cellpadding='0' align='left'>"
                + "                  <tbody>"
                + "                    <tr>"
                + "                      <td style='BORDER-TOP: medium none; BORDER-RIGHT: medium none; WIDTH: 100%; VERTICAL-ALIGN: middle; BORDER-BOTTOM: medium none; TEXT-ALIGN: center; PADDING: 10px;  BORDER-LEFT: medium none; BACKGROUND-COLOR: #efefef'><img title='URpin' style='     BACKGROUND-COLOR: transparent' border='0' alt='URpin Logo' src='http://urpin.com/img/logo_2.png' width='70' height='42' hspace='0' vspace='0'></td>"
                + "                    </tr>"
                + "                  </tbody>"
                + "                </table></td>"
                + "            </tr>"
                + "          </tbody>"
                + "        </table></td>"
                + "    </tr>"
                + "  </tbody>"
                + "</table>"
                + "</body>"
                + "</html>"
                + "";

        return BODY;
    }
}
