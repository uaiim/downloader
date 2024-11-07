package id.andtree.fetchapp;

import androidx.multidex.MultiDexApplication;

import id.andtree.fetch2.Fetch;
import id.andtree.fetch2.FetchConfiguration;
import id.andtree.fetch2.HttpUrlConnectionDownloader;
import id.andtree.fetch2core.Downloader;
import id.andtree.fetch2rx.RxFetch;

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
