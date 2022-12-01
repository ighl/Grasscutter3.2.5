// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.WireFormat;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import java.util.Iterator;
import com.google.protobuf.CodedOutputStream;
import java.util.Map;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MapEntry;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Parser;
import com.google.protobuf.MapField;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class WeaponOuterClass
{
    private static final Descriptors.Descriptor internal_static_Weapon_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_Weapon_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_Weapon_AffixMapEntry_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_Weapon_AffixMapEntry_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private WeaponOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return WeaponOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\fWeapon.proto\"\u0096\u0001\n\u0006Weapon\u0012\r\n\u0005level\u0018\u0001 \u0001(\r\u0012\u000b\n\u0003exp\u0018\u0002 \u0001(\r\u0012\u0015\n\rpromote_level\u0018\u0003 \u0001(\r\u0012(\n\taffix_map\u0018\u0004 \u0003(\u000b2\u0015.Weapon.AffixMapEntry\u001a/\n\rAffixMapEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\r\u0012\r\n\u0005value\u0018\u0002 \u0001(\r:\u00028\u0001B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        WeaponOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_Weapon_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_Weapon_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(WeaponOuterClass.internal_static_Weapon_descriptor, new String[] { "Level", "Exp", "PromoteLevel", "AffixMap" });
        internal_static_Weapon_AffixMapEntry_descriptor = WeaponOuterClass.internal_static_Weapon_descriptor.getNestedTypes().get(0);
        internal_static_Weapon_AffixMapEntry_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(WeaponOuterClass.internal_static_Weapon_AffixMapEntry_descriptor, new String[] { "Key", "Value" });
    }
    
    public static final class Weapon extends GeneratedMessageV3 implements WeaponOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int LEVEL_FIELD_NUMBER = 1;
        private int level_;
        public static final int EXP_FIELD_NUMBER = 2;
        private int exp_;
        public static final int PROMOTE_LEVEL_FIELD_NUMBER = 3;
        private int promoteLevel_;
        public static final int AFFIX_MAP_FIELD_NUMBER = 4;
        private MapField<Integer, Integer> affixMap_;
        private byte memoizedIsInitialized;
        private static final Weapon DEFAULT_INSTANCE;
        private static final Parser<Weapon> PARSER;
        
        private Weapon(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private Weapon() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new Weapon();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private Weapon(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            }
            int mutable_bitField0_ = 0;
            final UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    final int tag = input.readTag();
                    switch (tag) {
                        case 0: {
                            done = true;
                            continue;
                        }
                        case 8: {
                            this.level_ = input.readUInt32();
                            continue;
                        }
                        case 16: {
                            this.exp_ = input.readUInt32();
                            continue;
                        }
                        case 24: {
                            this.promoteLevel_ = input.readUInt32();
                            continue;
                        }
                        case 34: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.affixMap_ = MapField.newMapField(AffixMapDefaultEntryHolder.defaultEntry);
                                mutable_bitField0_ |= 0x1;
                            }
                            final MapEntry<Integer, Integer> affixMap__ = input.readMessage(AffixMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                            this.affixMap_.getMutableMap().put(affixMap__.getKey(), affixMap__.getValue());
                            continue;
                        }
                        default: {
                            if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                                continue;
                            }
                            continue;
                        }
                    }
                }
            }
            catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            }
            catch (IOException e2) {
                throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
            }
            finally {
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return WeaponOuterClass.internal_static_Weapon_descriptor;
        }
        
        @Override
        protected MapField internalGetMapField(final int number) {
            switch (number) {
                case 4: {
                    return this.internalGetAffixMap();
                }
                default: {
                    throw new RuntimeException("Invalid map field number: " + number);
                }
            }
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return WeaponOuterClass.internal_static_Weapon_fieldAccessorTable.ensureFieldAccessorsInitialized(Weapon.class, Builder.class);
        }
        
        @Override
        public int getLevel() {
            return this.level_;
        }
        
        @Override
        public int getExp() {
            return this.exp_;
        }
        
        @Override
        public int getPromoteLevel() {
            return this.promoteLevel_;
        }
        
        private MapField<Integer, Integer> internalGetAffixMap() {
            if (this.affixMap_ == null) {
                return MapField.emptyMapField(AffixMapDefaultEntryHolder.defaultEntry);
            }
            return this.affixMap_;
        }
        
        @Override
        public int getAffixMapCount() {
            return this.internalGetAffixMap().getMap().size();
        }
        
        @Override
        public boolean containsAffixMap(final int key) {
            return this.internalGetAffixMap().getMap().containsKey(key);
        }
        
        @Deprecated
        @Override
        public Map<Integer, Integer> getAffixMap() {
            return this.getAffixMapMap();
        }
        
        @Override
        public Map<Integer, Integer> getAffixMapMap() {
            return this.internalGetAffixMap().getMap();
        }
        
        @Override
        public int getAffixMapOrDefault(final int key, final int defaultValue) {
            final Map<Integer, Integer> map = this.internalGetAffixMap().getMap();
            return map.containsKey(key) ? map.get(key) : defaultValue;
        }
        
        @Override
        public int getAffixMapOrThrow(final int key) {
            final Map<Integer, Integer> map = this.internalGetAffixMap().getMap();
            if (!map.containsKey(key)) {
                throw new IllegalArgumentException();
            }
            return map.get(key);
        }
        
        @Override
        public final boolean isInitialized() {
            final byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) {
                return true;
            }
            if (isInitialized == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }
        
        @Override
        public void writeTo(final CodedOutputStream output) throws IOException {
            if (this.level_ != 0) {
                output.writeUInt32(1, this.level_);
            }
            if (this.exp_ != 0) {
                output.writeUInt32(2, this.exp_);
            }
            if (this.promoteLevel_ != 0) {
                output.writeUInt32(3, this.promoteLevel_);
            }
            GeneratedMessageV3.serializeIntegerMapTo(output, this.internalGetAffixMap(), AffixMapDefaultEntryHolder.defaultEntry, 4);
            this.unknownFields.writeTo(output);
        }
        
        @Override
        public int getSerializedSize() {
            int size = this.memoizedSize;
            if (size != -1) {
                return size;
            }
            size = 0;
            if (this.level_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.level_);
            }
            if (this.exp_ != 0) {
                size += CodedOutputStream.computeUInt32Size(2, this.exp_);
            }
            if (this.promoteLevel_ != 0) {
                size += CodedOutputStream.computeUInt32Size(3, this.promoteLevel_);
            }
            for (final Map.Entry<Integer, Integer> entry : this.internalGetAffixMap().getMap().entrySet()) {
                final MapEntry<Integer, Integer> affixMap__ = AffixMapDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).build();
                size += CodedOutputStream.computeMessageSize(4, affixMap__);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Weapon)) {
                return super.equals(obj);
            }
            final Weapon other = (Weapon)obj;
            return this.getLevel() == other.getLevel() && this.getExp() == other.getExp() && this.getPromoteLevel() == other.getPromoteLevel() && this.internalGetAffixMap().equals(other.internalGetAffixMap()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getLevel();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getExp();
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getPromoteLevel();
            if (!this.internalGetAffixMap().getMap().isEmpty()) {
                hash = 37 * hash + 4;
                hash = 53 * hash + this.internalGetAffixMap().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static Weapon parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return Weapon.PARSER.parseFrom(data);
        }
        
        public static Weapon parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return Weapon.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static Weapon parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return Weapon.PARSER.parseFrom(data);
        }
        
        public static Weapon parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return Weapon.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static Weapon parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return Weapon.PARSER.parseFrom(data);
        }
        
        public static Weapon parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return Weapon.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static Weapon parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Weapon.PARSER, input);
        }
        
        public static Weapon parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Weapon.PARSER, input, extensionRegistry);
        }
        
        public static Weapon parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(Weapon.PARSER, input);
        }
        
        public static Weapon parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(Weapon.PARSER, input, extensionRegistry);
        }
        
        public static Weapon parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Weapon.PARSER, input);
        }
        
        public static Weapon parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Weapon.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return Weapon.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final Weapon prototype) {
            return Weapon.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == Weapon.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static Weapon getDefaultInstance() {
            return Weapon.DEFAULT_INSTANCE;
        }
        
        public static Parser<Weapon> parser() {
            return Weapon.PARSER;
        }
        
        @Override
        public Parser<Weapon> getParserForType() {
            return Weapon.PARSER;
        }
        
        @Override
        public Weapon getDefaultInstanceForType() {
            return Weapon.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new Weapon();
            PARSER = new AbstractParser<Weapon>() {
                @Override
                public Weapon parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new Weapon(input, extensionRegistry);
                }
            };
        }
        
        private static final class AffixMapDefaultEntryHolder
        {
            static final MapEntry<Integer, Integer> defaultEntry;
            
            static {
                defaultEntry = MapEntry.newDefaultInstance(WeaponOuterClass.internal_static_Weapon_AffixMapEntry_descriptor, WireFormat.FieldType.UINT32, 0, WireFormat.FieldType.UINT32, 0);
            }
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WeaponOrBuilder
        {
            private int bitField0_;
            private int level_;
            private int exp_;
            private int promoteLevel_;
            private MapField<Integer, Integer> affixMap_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return WeaponOuterClass.internal_static_Weapon_descriptor;
            }
            
            @Override
            protected MapField internalGetMapField(final int number) {
                switch (number) {
                    case 4: {
                        return this.internalGetAffixMap();
                    }
                    default: {
                        throw new RuntimeException("Invalid map field number: " + number);
                    }
                }
            }
            
            @Override
            protected MapField internalGetMutableMapField(final int number) {
                switch (number) {
                    case 4: {
                        return this.internalGetMutableAffixMap();
                    }
                    default: {
                        throw new RuntimeException("Invalid map field number: " + number);
                    }
                }
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return WeaponOuterClass.internal_static_Weapon_fieldAccessorTable.ensureFieldAccessorsInitialized(Weapon.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (Weapon.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.level_ = 0;
                this.exp_ = 0;
                this.promoteLevel_ = 0;
                this.internalGetMutableAffixMap().clear();
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return WeaponOuterClass.internal_static_Weapon_descriptor;
            }
            
            @Override
            public Weapon getDefaultInstanceForType() {
                return Weapon.getDefaultInstance();
            }
            
            @Override
            public Weapon build() {
                final Weapon result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public Weapon buildPartial() {
                final Weapon result = new Weapon(this);
                final int from_bitField0_ = this.bitField0_;
                result.level_ = this.level_;
                result.exp_ = this.exp_;
                result.promoteLevel_ = this.promoteLevel_;
                (result.affixMap_ = this.internalGetAffixMap()).makeImmutable();
                this.onBuilt();
                return result;
            }
            
            @Override
            public Builder clone() {
                return super.clone();
            }
            
            @Override
            public Builder setField(final Descriptors.FieldDescriptor field, final Object value) {
                return super.setField(field, value);
            }
            
            @Override
            public Builder clearField(final Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }
            
            @Override
            public Builder clearOneof(final Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }
            
            @Override
            public Builder setRepeatedField(final Descriptors.FieldDescriptor field, final int index, final Object value) {
                return super.setRepeatedField(field, index, value);
            }
            
            @Override
            public Builder addRepeatedField(final Descriptors.FieldDescriptor field, final Object value) {
                return super.addRepeatedField(field, value);
            }
            
            @Override
            public Builder mergeFrom(final Message other) {
                if (other instanceof Weapon) {
                    return this.mergeFrom((Weapon)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final Weapon other) {
                if (other == Weapon.getDefaultInstance()) {
                    return this;
                }
                if (other.getLevel() != 0) {
                    this.setLevel(other.getLevel());
                }
                if (other.getExp() != 0) {
                    this.setExp(other.getExp());
                }
                if (other.getPromoteLevel() != 0) {
                    this.setPromoteLevel(other.getPromoteLevel());
                }
                this.internalGetMutableAffixMap().mergeFrom(other.internalGetAffixMap());
                this.mergeUnknownFields(other.unknownFields);
                this.onChanged();
                return this;
            }
            
            @Override
            public final boolean isInitialized() {
                return true;
            }
            
            @Override
            public Builder mergeFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
                Weapon parsedMessage = null;
                try {
                    parsedMessage = Weapon.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (Weapon)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            @Override
            public int getLevel() {
                return this.level_;
            }
            
            public Builder setLevel(final int value) {
                this.level_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearLevel() {
                this.level_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getExp() {
                return this.exp_;
            }
            
            public Builder setExp(final int value) {
                this.exp_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearExp() {
                this.exp_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getPromoteLevel() {
                return this.promoteLevel_;
            }
            
            public Builder setPromoteLevel(final int value) {
                this.promoteLevel_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearPromoteLevel() {
                this.promoteLevel_ = 0;
                this.onChanged();
                return this;
            }
            
            private MapField<Integer, Integer> internalGetAffixMap() {
                if (this.affixMap_ == null) {
                    return MapField.emptyMapField(AffixMapDefaultEntryHolder.defaultEntry);
                }
                return this.affixMap_;
            }
            
            private MapField<Integer, Integer> internalGetMutableAffixMap() {
                this.onChanged();
                if (this.affixMap_ == null) {
                    this.affixMap_ = MapField.newMapField(AffixMapDefaultEntryHolder.defaultEntry);
                }
                if (!this.affixMap_.isMutable()) {
                    this.affixMap_ = this.affixMap_.copy();
                }
                return this.affixMap_;
            }
            
            @Override
            public int getAffixMapCount() {
                return this.internalGetAffixMap().getMap().size();
            }
            
            @Override
            public boolean containsAffixMap(final int key) {
                return this.internalGetAffixMap().getMap().containsKey(key);
            }
            
            @Deprecated
            @Override
            public Map<Integer, Integer> getAffixMap() {
                return this.getAffixMapMap();
            }
            
            @Override
            public Map<Integer, Integer> getAffixMapMap() {
                return this.internalGetAffixMap().getMap();
            }
            
            @Override
            public int getAffixMapOrDefault(final int key, final int defaultValue) {
                final Map<Integer, Integer> map = this.internalGetAffixMap().getMap();
                return map.containsKey(key) ? map.get(key) : defaultValue;
            }
            
            @Override
            public int getAffixMapOrThrow(final int key) {
                final Map<Integer, Integer> map = this.internalGetAffixMap().getMap();
                if (!map.containsKey(key)) {
                    throw new IllegalArgumentException();
                }
                return map.get(key);
            }
            
            public Builder clearAffixMap() {
                this.internalGetMutableAffixMap().getMutableMap().clear();
                return this;
            }
            
            public Builder removeAffixMap(final int key) {
                this.internalGetMutableAffixMap().getMutableMap().remove(key);
                return this;
            }
            
            @Deprecated
            public Map<Integer, Integer> getMutableAffixMap() {
                return this.internalGetMutableAffixMap().getMutableMap();
            }
            
            public Builder putAffixMap(final int key, final int value) {
                this.internalGetMutableAffixMap().getMutableMap().put(key, value);
                return this;
            }
            
            public Builder putAllAffixMap(final Map<Integer, Integer> values) {
                this.internalGetMutableAffixMap().getMutableMap().putAll(values);
                return this;
            }
            
            @Override
            public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }
            
            @Override
            public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }
        }
    }
    
    public interface WeaponOrBuilder extends MessageOrBuilder
    {
        int getLevel();
        
        int getExp();
        
        int getPromoteLevel();
        
        int getAffixMapCount();
        
        boolean containsAffixMap(final int p0);
        
        @Deprecated
        Map<Integer, Integer> getAffixMap();
        
        Map<Integer, Integer> getAffixMapMap();
        
        int getAffixMapOrDefault(final int p0, final int p1);
        
        int getAffixMapOrThrow(final int p0);
    }
}
