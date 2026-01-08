public class DigitalCamera extends Camera
{
  private double megapixels;
  private ImageDirectory imageDirectory;

  public DigitalCamera(Manufacturer manufacturer, double megapixels, int maxNumberOfImages)
  {
    super(manufacturer);
    this.megapixels = megapixels;
    this.imageDirectory = new ImageDirectory(maxNumberOfImages);
  }

  public void takeAPicture()
  {
    imageDirectory.addImage();
  }

  public void addDescriptionToLastPicture(String description)
  {
    int numberOfImages = imageDirectory.getNumberOfImages();
    imageDirectory.addDescription(numberOfImages-1, description);
  }

  public ImageDirectory getImageDirectory()
  {
    return imageDirectory;
  }
}
