package com.terikon.cordova.photolibrary;

public class PhotoLibraryGetLibraryOptions {

  public final int itemsInChunk;
  public final double chunkTimeSec;
  public final boolean includeAlbumData;
  public final int maxItems;

  public PhotoLibraryGetLibraryOptions(int itemsInChunk, double chunkTimeSec, boolean includeAlbumData, int maxItems) {
    this.itemsInChunk = itemsInChunk;
    this.chunkTimeSec = chunkTimeSec;
    this.includeAlbumData = includeAlbumData;
    this.maxItems = maxItems;
  }

}
