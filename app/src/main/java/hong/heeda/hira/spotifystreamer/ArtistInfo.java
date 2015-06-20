package hong.heeda.hira.spotifystreamer;

import android.os.Parcel;
import android.os.Parcelable;

public class ArtistInfo implements Parcelable {
    public static final Parcelable.Creator<ArtistInfo> CREATOR = new Parcelable.Creator<ArtistInfo>() {
        public ArtistInfo createFromParcel(Parcel source) {
            return new ArtistInfo(source);
        }

        public ArtistInfo[] newArray(int size) {
            return new ArtistInfo[size];
        }
    };
    public String id;
    public String name;
    public String imageUrl;

    public ArtistInfo(String id,
                      String name,
                      String imageUrl) {
        this.id = id;
        this.name = name;
        this.imageUrl = imageUrl;
    }

    protected ArtistInfo(Parcel in) {
        this.id = in.readString();
        this.name = in.readString();
        this.imageUrl = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest,
                              int flags) {
        dest.writeString(this.id);
        dest.writeString(this.name);
        dest.writeString(this.imageUrl);
    }
}