package com.lazarus.episode1.intuit;

import org.apache.commons.validator.routines.UrlValidator;

public class TestURLValidator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("item.images.dir","doms/dom/admin/jsp/");
		//String fileNameOfImage = "MW40_550G_65_JOSEPH_ABBOUD_NDS_COTTON_MAIN.jpg";
		String fileNameOfImage = "http://images.menswearhouse.com/is/image/TMW/MW40_550G_65_JOSEPH_ABBOUD_NDS_COTTON_MAIN?$pickTicket$";
		/*UrlValidator urlValidator = new UrlValidator();
		boolean isValid = urlValidator.isValid("MW40_550G_65_JOSEPH_ABBOUD_NDS_COTTON_MAIN.jpg");
		System.out.println(isValid);*/
		
		String imageURL = "";
		String relativePath = System.getProperty("item.images.dir");
		if (fileNameOfImage == null || fileNameOfImage == "")
		{
			System.out.println("defualy");
			imageURL = relativePath+"ImageNotAvailable.jpg";
			/*
			 * imageURL = InStorePickupConstant.RELATIVE_PATH_OF_THE_IMAGE
			 * +InStorePickupConstant.IMAGE_NOT_AVAILABLE_FILE_NAME
			 * +InStorePickupConstant.JPG;
			 */
		}
		else
		{
			imageURL = fileNameOfImage;
			UrlValidator urlValidator = new UrlValidator();
			boolean  isFileNameOfImageValidUrl = urlValidator.isValid(fileNameOfImage);

			if(!isFileNameOfImageValidUrl &&  (relativePath != null && relativePath != "") )
			{
				imageURL = relativePath + fileNameOfImage;
			}
		}
		
		System.out.println(imageURL);
	}

}
