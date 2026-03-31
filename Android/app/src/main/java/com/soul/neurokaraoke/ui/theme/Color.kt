package com.soul.neurokaraoke.ui.theme

import androidx.compose.ui.graphics.Color

// ==========================================
// NEURO THEME (Cyan — Cinematic Dark)
// ==========================================
val NeuroBackground = Color(0xFF060608)       // Near-black with blue undertone
val NeuroSurface = Color(0xFF0F1117)          // Elevated surface
val NeuroSurfaceVariant = Color(0xFF181B24)   // Cards, inputs
val NeuroPrimary = Color(0xFF00D4FF)          // Cyan accent
val NeuroSecondary = Color(0xFF64DFFF)        // Lighter cyan
val NeuroTertiary = Color(0xFF8B5CF6)         // Purple for variety
val NeuroGradientStart = Color(0xFF00D4FF)    // Cyan
val NeuroGradientMid = Color(0xFF0099CC)      // Mid cyan
val NeuroGradientEnd = Color(0xFF006B99)      // Deep cyan
val NeuroOnBackground = Color(0xFFEDEDEF)     // Primary text (not pure white)
val NeuroOnSurface = Color(0xFF9CA3AF)        // Secondary text
val NeuroOnSurfaceVariant = Color(0xFF6B7280) // Tertiary/muted text
val NeuroDivider = Color(0xFF1F2937)
val NeuroGlow = Color(0xFF33E5FF)             // Bright glow

// ==========================================
// EVIL THEME (Pink/Magenta — Cinematic Dark)
// ==========================================
val EvilBackground = Color(0xFF080507)        // Near-black with warm undertone
val EvilSurface = Color(0xFF14101A)           // Elevated
val EvilSurfaceVariant = Color(0xFF1E1724)    // Cards
val EvilPrimary = Color(0xFFE91E8C)           // Hot pink
val EvilSecondary = Color(0xFFFF6BB5)         // Lighter pink
val EvilTertiary = Color(0xFFB34D80)          // Muted rose
val EvilGradientStart = Color(0xFFE91E8C)     // Hot pink
val EvilGradientMid = Color(0xFFBF1574)       // Mid pink
val EvilGradientEnd = Color(0xFF9C27B0)       // Purple
val EvilOnBackground = Color(0xFFEDEDEF)
val EvilOnSurface = Color(0xFFB0A3B8)         // Pinkish muted
val EvilOnSurfaceVariant = Color(0xFF7A6B85)
val EvilDivider = Color(0xFF2A1E32)
val EvilGlow = Color(0xFFFF3DA6)

// ==========================================
// DUET THEME (Amethyst Purple — Cinematic Dark)
// ==========================================
val DuetBackground = Color(0xFF070510)        // Deep purple-black
val DuetSurface = Color(0xFF110E1C)           // Elevated
val DuetSurfaceVariant = Color(0xFF1C1730)    // Cards
val DuetPrimary = Color(0xFF9C5FD4)           // Amethyst
val DuetSecondary = Color(0xFFB388E8)         // Lighter lavender
val DuetTertiary = Color(0xFF7B4AAF)          // Deeper purple
val DuetGradientStart = Color(0xFF9C5FD4)     // Amethyst
val DuetGradientMid = Color(0xFF8247BD)       // Mid purple
val DuetGradientEnd = Color(0xFF6B3FA0)       // Deep purple
val DuetOnBackground = Color(0xFFEDEDEF)
val DuetOnSurface = Color(0xFFB8B0C8)         // Lavender muted
val DuetOnSurfaceVariant = Color(0xFF8278A0)
val DuetDivider = Color(0xFF2A2240)
val DuetGlow = Color(0xFFB87FE8)

// ==========================================
// SHARED COLORS
// ==========================================
val OnPrimary = Color(0xFF000000)
val OnSecondary = Color(0xFF000000)
val ErrorColor = Color(0xFFFF5252)
val SuccessColor = Color(0xFF4CAF50)

// Legacy aliases (for gradual migration of screens)
val Background = NeuroBackground
val Surface = NeuroSurface
val SurfaceVariant = NeuroSurfaceVariant
val Primary = NeuroPrimary
val Secondary = NeuroSecondary
val Tertiary = NeuroTertiary
val OnBackground = NeuroOnBackground
val OnSurface = NeuroOnSurface
val OnSurfaceVariant = NeuroOnSurfaceVariant
val CardBorder = Primary
val DividerColor = NeuroDivider

// ==========================================
// GRADIENT COLOR LISTS
// ==========================================
val NeuroGradientColors = listOf(NeuroGradientStart, NeuroGradientMid, NeuroGradientEnd)
val EvilGradientColors = listOf(EvilGradientStart, EvilGradientMid, EvilGradientEnd)
val DuetGradientColors = listOf(DuetGradientStart, DuetGradientMid, DuetGradientEnd)

// Singer-specific colors
val NeuroColor = Color(0xFF00D4FF)   // Cyan for Neuro
val EvilColor = Color(0xFFE91E8C)    // Pink for Evil
val DuetColor = Color(0xFF9C5FD4)    // Purple for Duet
val OtherColor = Color(0xFF6B7280)   // Gray for Other
