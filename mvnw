#!/bin/sh
# ----------------------------------------------------------------------------
# Apache Maven Wrapper startup script, version 3.3.2 (only-script mode)
#
# Downloads Apache Maven on first run, then delegates to it. Requires only a
# JDK to be installed and JAVA_HOME (or java on PATH) to be available.
# ----------------------------------------------------------------------------
set -e

MAVEN_VERSION="3.9.9"
DIST_URL="https://repo.maven.apache.org/maven2/org/apache/maven/apache-maven/${MAVEN_VERSION}/apache-maven-${MAVEN_VERSION}-bin.zip"
WRAPPER_DIR="${HOME}/.m2/wrapper/dists/apache-maven-${MAVEN_VERSION}"
MVN_CMD="${WRAPPER_DIR}/apache-maven-${MAVEN_VERSION}/bin/mvn"

if [ ! -x "${MVN_CMD}" ]; then
  echo "Downloading Apache Maven ${MAVEN_VERSION} ..."
  mkdir -p "${WRAPPER_DIR}"
  ZIP="${WRAPPER_DIR}/maven.zip"
  if command -v curl >/dev/null 2>&1; then
    curl -fsSL "${DIST_URL}" -o "${ZIP}"
  else
    wget -q "${DIST_URL}" -O "${ZIP}"
  fi
  unzip -q "${ZIP}" -d "${WRAPPER_DIR}"
  rm -f "${ZIP}"
  chmod +x "${MVN_CMD}"
fi

exec "${MVN_CMD}" "$@"
