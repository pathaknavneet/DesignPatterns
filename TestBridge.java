
interface FileDownloadAbstraction {
  
  Object download (String os );
 
  boolean store(String os);
}

class FileDownloadAbstractImpl implements FileDownloadAbstraction{

  
  private FileDownloadImplementerAbstraction fileDownloadImplementerAbstraction =null;
  
  public FileDownloadAbstractImpl(FileDownloadImplementerAbstraction fileAbstraction){
    this.fileDownloadImplementerAbstraction=fileAbstraction;
  }
  
  
  @Override
  public Object download(String file) {
    return fileDownloadImplementerAbstraction.downloadFile(file);
    
    
  }
  
  

  @Override
  public boolean store(String file) {
   return  fileDownloadImplementerAbstraction.storeFile(file);
   
    
  }
  
}

interface FileDownloadImplementerAbstraction {
  
  Object downloadFile(String os );
  boolean storeFile(String os );
}

class FileDownloadImplementerAbstractionImpl implements FileDownloadImplementerAbstraction
{

  @Override
  public Object downloadFile(String os) {
    
    System.out.println("");
    
    return new Object();
  }

  @Override
  public boolean storeFile(String file) {
    System.out.println("Stored the file "+file);
    return true;
  }
  
  
}

public class TestBridge {

  
  public static void main(String[] args) {
    
    
  }
}
