## SmartClash

[![Downloads](https://img.shields.io/github/downloads/feryw/SmartClashUI/total?style=flat-square&logo=github)](https://github.com/feryw/SmartClashUI/releases/)[![Last Version](https://img.shields.io/github/release/feryw/SmartClashUI/all.svg?style=flat-square)](https://github.com/feryw/SmartClashUI/releases/)[![License](https://img.shields.io/github/license/feryw/SmartClashUI?style=flat-square)](LICENSE)

A multi-platform proxy client based on Smart ClashMeta, simple and easy to use, open-source and ad-free.

## Features

✈️ Multi-platform: Android, Windows, macOS and Linux

💻 Adaptive multiple screen sizes, Multiple color themes available

💡 Based on Material You Design, [Surfboard](https://github.com/getsurfboard/surfboard)-like UI

☁️ Supports data sync via WebDAV

✨ Support subscription link, Dark mode

## Use

### Linux

⚠️ Make sure to install the following dependencies before using them

   ```bash
    sudo apt-get install libayatana-appindicator3-dev
    sudo apt-get install libkeybinder-3.0-dev
   ```

### Android

Support the following actions

   ```bash
    com.follow.clash.action.START
    
    com.follow.clash.action.STOP
    
    com.follow.clash.action.CHANGE
   ```

## Build

1. Update submodules
   ```bash
   git submodule update --init --recursive
   ```

2. Install `Flutter` and `Golang` environment

3. Build Application

    - android

        1. Install  `Android SDK` ,  `Android NDK`

        2. Set `ANDROID_NDK` environment variables

        3. Run Build script

           ```bash
           dart .\setup.dart android
           ```

    - windows

        1. You need a windows client

        2. Install  `Gcc`，`Inno Setup`

        3. Run build script

           ```bash
           dart .\setup.dart windows --arch <arm64 | amd64>
           ```

    - linux

        1. You need a linux client

        2. Run build script

           ```bash
           dart .\setup.dart linux --arch <arm64 | amd64>
           ```

    - macOS

        1. You need a macOS client

        2. Run build script

           ```bash
           dart .\setup.dart macos --arch <arm64 | amd64>
           ```

## Star

The easiest way to support developers is to click on the star (⭐) at the top of the page.

<p style="text-align: center;">
    <a href="https://api.star-history.com/svg?repos=feryw/SmartClashUI&Date">
        <img alt="start" width=50% src="https://api.star-history.com/svg?repos=feryw/SmartClashUI&Date"/>
    </a>
</p>
