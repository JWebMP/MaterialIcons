# JWebMP Material Icons (Community MDI)

[![Maven Central](https://img.shields.io/maven-central/v/com.jwebmp.plugins/material-icons)](https://central.sonatype.com/artifact/com.jwebmp.plugins/material-icons)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue)](https://www.apache.org/licenses/LICENSE-2.0)

![Java 25+](https://img.shields.io/badge/Java-25%2B-green)
![Modular](https://img.shields.io/badge/Modular-JPMS-green)
![Angular](https://img.shields.io/badge/Angular-21-DD0031?logo=angular)

<!-- Tech icons row -->
![MDI](https://img.shields.io/badge/MDI-2.4.85-blueviolet)
![JWebMP](https://img.shields.io/badge/JWebMP-2.0-0A7)

2,000+ community Material Design icons for JWebMP applications. CSS web font rendering with `mdi-` class prefix and optional CDN support.

Built on [Material Design Icons (Community)](https://materialdesignicons.com/) · [Angular 21](https://angular.dev/) · [JWebMP Core](https://jwebmp.com/) · JPMS module `com.jwebmp.plugins.materialicons` · Java 25+

**Version: 2.4.85** — Comprehensive community icon set with type-safe Java enum API.

## Installation

```xml
<dependency>
  <groupId>com.jwebmp.plugins</groupId>
  <artifactId>material-icons</artifactId>
  <version>2.0.3-SNAPSHOT</version>
</dependency>
```

<details>
<summary>Gradle (Kotlin DSL)</summary>

```kotlin
implementation("com.jwebmp.plugins:material-icons:2.0.0-SNAPSHOT")
```
</details>

## Features

- **2,000+ Community Icons** — Comprehensive material design icon set
- **Type-Safe Java Enum API** — `MDIIcons` enum with compile-time safety and IDE autocomplete
- **CSS Web Font Rendering** — `mdi` and `mdi-` prefixed CSS classes
- **CRTP Fluent API** — `MDIIcon<J>` component with type-safe method chaining
- **IIcon Interface** — Implements JWebMP's standard icon interface for interoperability
- **CDN Support** — Optional CDN URL for materialdesignicons.min.css
- **Zero Configuration** — Auto-registered via ServiceLoader SPI
- **Modular Architecture** — JPMS module with explicit dependencies

## Quick Start

### Prerequisites

- **Java 25 LTS** (required)
- **Maven 3.8+**
- **Node.js 18+** (for frontend builds)
- **Angular 21+** (auto-integrated via JWebMP)

### Basic Usage

```java
import com.jwebmp.plugins.materialicons.MDIIcon;
import com.jwebmp.plugins.materialicons.MDIIcons;

// Create an account icon
var accountIcon = new MDIIcon<>(MDIIcons.account);

// Settings icon
var settings = new MDIIcon<>(MDIIcons.settings);

// Email icon
var email = new MDIIcon<>(MDIIcons.email);
```

### Icon Categories

```java
// User & Account
MDIIcons.account, MDIIcons.account_circle, MDIIcons.account_box, MDIIcons.account_key

// Common UI
MDIIcons.home, MDIIcons.settings, MDIIcons.search, MDIIcons.menu

// Communication
MDIIcons.email, MDIIcons.phone, MDIIcons.message, MDIIcons.chat

// File & Storage
MDIIcons.file, MDIIcons.folder, MDIIcons.cloud, MDIIcons.download, MDIIcons.upload

// Media
MDIIcons.play, MDIIcons.pause, MDIIcons.stop, MDIIcons.skip_next
```

---

## Architecture

### Module Structure

```
src/main/java/com/jwebmp/plugins/materialicons/
├── MDIIcon.java                        # CRTP icon component (italic-based)
├── MDIIcons.java                       # Enum with 2,000+ icon constants
├── MaterialIconsPageConfigurator.java  # Auto-registration via ServiceLoader
└── implementations/
    ├── MaterialIconsInclusionModule.java
    └── MaterialIconsExclusionsModule.java
```

---

## API Reference

### MDIIcon Component

```java
public class MDIIcon<J extends MDIIcon<J>>
    extends Italic<J>
    implements IIcon<IComponentHierarchyBase<?,?>, J>

// Constructors
new MDIIcon<>(MDIIcons.account)    // Icon from enum
new MDIIcon<>()                     // Empty

// Methods
icon.getClassName()      // Returns CSS class string
icon.getIconComponent()  // Returns this component as IComponentHierarchyBase
```

### MDIIcons Enum

```java
MDIIcons.account.toString()  // → "mdi mdi-account"
MDIIcons.home.toString()     // → "mdi mdi-home"
```

---

## Configuration

### Auto-Configuration via PageConfigurator

The plugin is automatically configured when present on the classpath. It registers the MDI CSS stylesheet (local or CDN).

### Manual Disable (Optional)

```java
MaterialIconsPageConfigurator.setEnabled(false);
```

---

## Module Graph

```
com.jwebmp.plugins.materialicons
 ├── com.jwebmp.core              (JWebMP core)
 └── com.guicedee.guicedinjection (Guice DI)
```

### Exported Packages

- `com.jwebmp.plugins.materialicons` — Icon component, enum, and configurator

---

## Testing

```bash
mvn clean test
```

---

## Documentation

- **[Material Design Icons](https://materialdesignicons.com/)** — Community icon reference
- **[JWebMP Home](https://jwebmp.com/)** — JWebMP framework documentation

| File | Purpose |
|------|---------|
| `MDIIcon.java` | CRTP icon component |
| `MDIIcons.java` | Enum with 2,000+ icons |
| `MaterialIconsPageConfigurator.java` | Auto-configuration via ServiceLoader |
| `module-info.java` | JPMS module descriptor |

---

## Security

- No external network calls at runtime (CDN optional)
- No secrets or credentials required
- Pure CSS web font icon library

---

## Contributing

1. **Fork** the repository
2. **Create a feature branch** (`git checkout -b feature/my-feature`)
3. **Commit with clear messages** (`git commit -m "feat: add new icon"`)
4. **Push to your fork** (`git push origin feature/my-feature`)
5. **Open a Pull Request**

---

## Project Status

| Aspect | Status |
|--------|--------|
| **Version** | 2.4.85 / 2.0.0-SNAPSHOT |
| **Icons** | 2,000+ complete |
| **Java** | 25 LTS (required) |
| **Build** | Passing |
| **License** | Apache 2.0 |
| **Maintenance** | Active |

---

## Links

- **GitHub Repository**: https://github.com/JWebMP/JWebMP
- **Material Design Icons**: https://materialdesignicons.com/
- **JWebMP Home**: https://jwebmp.com/

---

## License

Licensed under the [Apache License 2.0](LICENSE).

```
Copyright 2025 JWebMP Contributors

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
```

---

## Acknowledgments

- **[Material Design Icons Community](https://materialdesignicons.com/)** — Community icon set
- **[JWebMP](https://jwebmp.com/)** — Server-driven web framework
- **[Angular](https://angular.dev/)** — Modern web framework

---

## Support

- **GitHub Issues**: https://github.com/JWebMP/JWebMP/issues
- **Discussions**: https://github.com/JWebMP/JWebMP/discussions

---

**Made with JWebMP**

