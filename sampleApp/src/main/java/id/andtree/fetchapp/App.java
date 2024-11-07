package id.andtree.fetchapp;

import androidx.multidex.MultiDexApplication;

import id.andtree.req.Fetch;
import id.andtree.req.FetchConfiguration;
import id.andtree.req.HttpUrlConnectionDownloader;
import id.andtree.reqcore.Downloader;
import id.andtree.reqrx.RxFetch;

public class App extends MultiDexApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        TimberUtils.configTimber();
        final FetchConfiguration fetchConfiguration = new FetchConfiguration.Builder(this)
                .enableRetryOnNetworkGain(true)
                .setDownloadConcurrentLimit(3)
                .setHttpDownloader(new HttpUrlConnectionDownloader(Downloader.FileDownloaderType.PARALLEL))
                .build();
        Fetch.Impl.setDefaultInstanceConfiguration(fetchConfiguration);
        RxFetch.Impl.setDefaultRxInstanceConfiguration(fetchConfiguration);
    }
}
