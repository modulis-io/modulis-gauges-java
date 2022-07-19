/*
 * Copyright © 2022 JINSPIRED B.V.
 */

package io.modulis.gauges.spi.alpha;

import io.humainary.gauges.spi.GaugesProvider;
import io.humainary.spi.Providers.Factory;

/**
 * The SPI provider factory implementation of {@link GaugesProvider}.
 *
 * @author wlouth
 * @since 1.0
 */

public final class ProviderFactory
  implements Factory< GaugesProvider > {

  @Override
  public GaugesProvider create () {

    return
      new Provider ();

  }

}
