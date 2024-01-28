# bastom

[![standard-readme compliant](https://img.shields.io/badge/standard--readme-OK-green.svg?style=flat-square)](https://github.com/RichardLitt/standard-readme)
[![GitHub](https://img.shields.io/github/license/AndusDEV/bastom?style=flat-square&color=b2204c)](https://github.com/AndusDEV/bastom/blob/master/LICENSE)
[![GitHub Repo stars](https://img.shields.io/github/stars/AndusDEV/bastom?style=flat-square)](https://github.com/AndusDEV/bastom/stargazers)
[![GitHub forks](https://img.shields.io/github/forks/AndusDEV/bastom?style=flat-square)](https://github.com/AndusDEV/bastom/network/members)
[![GitHub release (latest SemVer)](https://img.shields.io/github/v/release/AndusDEV/bastom?style=flat-square)](https://github.com/AndusDEV/bastom/releases/latest)
[![GitHub all releases](https://img.shields.io/github/downloads/AndusDEV/bastom/total?style=flat-square)](https://github.com/AndusDEV/bastom/releases)

Bastom is a [Minestom](https://github.com/minestom/minestom) minecraft server containing some basic features that could be useful.
It is based on [Microstom](https://github.com/KlainStom/microstom) - a minimal implementation of Minestom.

Bastom seeks to still be a minimal implementation of a Minestom server like [Microstom](https://github.com/KlainStom/microstom), but contain some features that can be useful for nearly every server.
But there's still almost nothing by default.

## Table of Contents

- [Install](#install)
- [Usage](#usage)
- [API](#api)
- [Maintainers](#maintainers)
- [Contributing](#contributing)
- [License](#license)

## Install
You could either just download a [release](https://github.com/AndusDEV/bastom/releases) or you compile the server yourself using the following commands under Linux
```shell
git clone https://github.com/AndusDEV/bastom.git
cd bastom
./gradlew build
```
The server jar will be located at `build/libs/Bastom-<VERSION>.jar`.

Note that for compiling you need to use a JDK 17.

## Usage
To run the server you need to have a Java 17 runtime installed.
Use the following command to start the server for the first time.
```shell
java -jar Bastom-<VERSION>.jar
```
This generates a `start.sh` script and a settings file with these default values:
```json5
{
  "SERVER_IP": "localhost",
  "SERVER_PORT": 25565,
  "MODE": "OFFLINE", // may be OFFLINE, ONLINE, BUNGEECORD or VELOCITY
  "VELOCITY_SECRET": "",
  "TPS": null, // default 20
  "CHUNK_VIEW_DISTANCE": null, // default 8
  "ENTITY_VIEW_DISTANCE": null, // default 5
  "TERMINAL_DISABLED": false // default false
}
```
You have to restart the server for changes in there to take effect.

Note that this server only supports 1.19.2 clients on version 6.0.0, 1.18.2 clients on version 5.0.0 and 1.18/1.18.1 on version 4.0.0. To allow other/multiple versions to connect you need to use a proxy with plugins like ViaVersion.

## Restarting
Restarting the server calls the `./start.sh` script.
The generated script will restart the server with no way to access the console.
So keep in mind that you will need an extension providing remote access or use tmux/screen in the `start.sh` to access the console.


## API
This server itself does not add some API. But it features [Minestom's API](https://github.com/Minestom/Minestom) so you can use it from within extensions.

## Maintainers

 - [@andusdev](https://github.com/andusdev)
 - [Original (microstom)](https://github.com/KlainStom/microstom)

## Contributing

PRs accepted.

Small note: If editing the README, please conform to the [standard-readme](https://github.com/RichardLitt/standard-readme) specification.

## License

This project is licensed under the [MIT License](LICENSE).
