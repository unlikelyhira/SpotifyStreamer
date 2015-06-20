package hong.heeda.hira.spotifystreamer;

import android.os.Parcel;
import android.os.Parcelable;

public class TrackInfo implements Parcelable {
    public static final Parcelable.Creator<TrackInfo> CREATOR = new Parcelable.Creator<TrackInfo>() {
        public TrackInfo createFromParcel(Parcel source) {
            return new TrackInfo(source);
        }

        public TrackInfo[] newArray(int size) {
            return new TrackInfo[size];
        }
    };
    public String name;
    public String artist;
    public String album;
    public String imageUrl;

    public TrackInfo(String name,
                     String artist,
                     String album,
                     String imageUrl) {
        this.name = name;
        this.artist = artist;
        this.album = album;
        this.imageUrl = imageUrl;
    }

    protected TrackInfo(Parcel in) {
        this.name = in.readString();
        this.artist = in.readString();
        this.album = in.readString();
        this.imageUrl = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest,
                              int flags) {
        dest.writeString(this.name);
        dest.writeString(this.artist);
        dest.writeString(this.album);
        dest.writeString(this.imageUrl);
    }
}