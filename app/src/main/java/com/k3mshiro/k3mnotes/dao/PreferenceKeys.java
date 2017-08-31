package com.k3mshiro.k3mnotes.dao;

import android.content.res.Resources;

import com.k3mshiro.k3mnotes.R;

public class PreferenceKeys {
    public final String night_mode_pref_key;

    public PreferenceKeys(Resources resources) {
        night_mode_pref_key = resources.getString(R.string.night_mode_pref_key);
    }
}