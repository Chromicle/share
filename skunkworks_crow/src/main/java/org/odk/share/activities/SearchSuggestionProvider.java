package org.odk.share.activities;

import android.content.SearchRecentSuggestionsProvider;

import static org.odk.collect.android.provider.InstanceProviderAPI.AUTHORITY;

public class SearchSuggestionProvider extends SearchRecentSuggestionsProvider {

    public final static String AUTHORITY = "openfoodfacts.github.scrachx.openfood.utils.SearchSuggestionProvider";
    public final static int MODE = DATABASE_MODE_QUERIES;

    public SearchSuggestionProvider() {
        setupSuggestions(AUTHORITY, MODE);
    }
}