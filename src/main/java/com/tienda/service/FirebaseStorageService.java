
package com.tienda.service;

import org.springframework.web.multipart.MultipartFile;


public interface FirebaseStorageService {
    public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, long id);
    
    //El BuketName es el <id del proyecto>+.appspot.com
    
    final String BucketName="techshop-951c1.appspot.com";
    
    //Esta es la ruta base de este proyecto en el Storage
    final String rutaSuperiorStorage="techshop";
    
    //Ubicacion del archivo final json
    final String rutaJsonFile="firebase";
    
    final String archivoJsonFile="techshop-951c1-firebase-adminsdk-w3bgo-1908b1c2d2";
    
}
