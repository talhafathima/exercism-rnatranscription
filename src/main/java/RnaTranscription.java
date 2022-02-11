class RnaTranscription {
    String transcribe(String dnaStrand) {
        char[] c=dnaStrand.toCharArray();
        for(int i=0;i<c.length;i++)
        {
        switch (c[i])
        {
        case 'G':
            {
                c[i]='C';
                break;
            }
        case 'C':
            {
                c[i]='G';
                break;
            }
         case 'T':
            {
                c[i]='A';
                break;
            }
         case 'A':
            {
                c[i]='U';
                break;
            }
        }
        }
      String s=new String(c);
     return s;
    }
    }
