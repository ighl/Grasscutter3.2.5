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
import com.google.protobuf.Internal;
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

public final class WeaponAwakenReqOuterClass
{
    private static final Descriptors.Descriptor internal_static_WeaponAwakenReq_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_WeaponAwakenReq_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_WeaponAwakenReq_AffixLevelMapEntry_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_WeaponAwakenReq_AffixLevelMapEntry_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private WeaponAwakenReqOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return WeaponAwakenReqOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0015WeaponAwakenReq.proto\"´\u0001\n\u000fWeaponAwakenReq\u0012\u0011\n\titem_guid\u0018\n \u0001(\u0004\u0012<\n\u000faffix_level_map\u0018\u0007 \u0003(\u000b2#.WeaponAwakenReq.AffixLevelMapEntry\u0012\u001a\n\u0012target_weapon_guid\u0018\t \u0001(\u0004\u001a4\n\u0012AffixLevelMapEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\r\u0012\r\n\u0005value\u0018\u0002 \u0001(\r:\u00028\u0001B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        WeaponAwakenReqOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_WeaponAwakenReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_WeaponAwakenReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(WeaponAwakenReqOuterClass.internal_static_WeaponAwakenReq_descriptor, new String[] { "ItemGuid", "AffixLevelMap", "TargetWeaponGuid" });
        internal_static_WeaponAwakenReq_AffixLevelMapEntry_descriptor = WeaponAwakenReqOuterClass.internal_static_WeaponAwakenReq_descriptor.getNestedTypes().get(0);
        internal_static_WeaponAwakenReq_AffixLevelMapEntry_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(WeaponAwakenReqOuterClass.internal_static_WeaponAwakenReq_AffixLevelMapEntry_descriptor, new String[] { "Key", "Value" });
    }
    
    public static final class WeaponAwakenReq extends GeneratedMessageV3 implements WeaponAwakenReqOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int ITEM_GUID_FIELD_NUMBER = 10;
        private long itemGuid_;
        public static final int AFFIX_LEVEL_MAP_FIELD_NUMBER = 7;
        private MapField<Integer, Integer> affixLevelMap_;
        public static final int TARGET_WEAPON_GUID_FIELD_NUMBER = 9;
        private long targetWeaponGuid_;
        private byte memoizedIsInitialized;
        private static final WeaponAwakenReq DEFAULT_INSTANCE;
        private static final Parser<WeaponAwakenReq> PARSER;
        
        private WeaponAwakenReq(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private WeaponAwakenReq() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new WeaponAwakenReq();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private WeaponAwakenReq(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 58: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.affixLevelMap_ = MapField.newMapField(AffixLevelMapDefaultEntryHolder.defaultEntry);
                                mutable_bitField0_ |= 0x1;
                            }
                            final MapEntry<Integer, Integer> affixLevelMap__ = input.readMessage(AffixLevelMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                            this.affixLevelMap_.getMutableMap().put(affixLevelMap__.getKey(), affixLevelMap__.getValue());
                            continue;
                        }
                        case 72: {
                            this.targetWeaponGuid_ = input.readUInt64();
                            continue;
                        }
                        case 80: {
                            this.itemGuid_ = input.readUInt64();
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
            return WeaponAwakenReqOuterClass.internal_static_WeaponAwakenReq_descriptor;
        }
        
        @Override
        protected MapField internalGetMapField(final int number) {
            switch (number) {
                case 7: {
                    return this.internalGetAffixLevelMap();
                }
                default: {
                    throw new RuntimeException("Invalid map field number: " + number);
                }
            }
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return WeaponAwakenReqOuterClass.internal_static_WeaponAwakenReq_fieldAccessorTable.ensureFieldAccessorsInitialized(WeaponAwakenReq.class, Builder.class);
        }
        
        @Override
        public long getItemGuid() {
            return this.itemGuid_;
        }
        
        private MapField<Integer, Integer> internalGetAffixLevelMap() {
            if (this.affixLevelMap_ == null) {
                return MapField.emptyMapField(AffixLevelMapDefaultEntryHolder.defaultEntry);
            }
            return this.affixLevelMap_;
        }
        
        @Override
        public int getAffixLevelMapCount() {
            return this.internalGetAffixLevelMap().getMap().size();
        }
        
        @Override
        public boolean containsAffixLevelMap(final int key) {
            return this.internalGetAffixLevelMap().getMap().containsKey(key);
        }
        
        @Deprecated
        @Override
        public Map<Integer, Integer> getAffixLevelMap() {
            return this.getAffixLevelMapMap();
        }
        
        @Override
        public Map<Integer, Integer> getAffixLevelMapMap() {
            return this.internalGetAffixLevelMap().getMap();
        }
        
        @Override
        public int getAffixLevelMapOrDefault(final int key, final int defaultValue) {
            final Map<Integer, Integer> map = this.internalGetAffixLevelMap().getMap();
            return map.containsKey(key) ? map.get(key) : defaultValue;
        }
        
        @Override
        public int getAffixLevelMapOrThrow(final int key) {
            final Map<Integer, Integer> map = this.internalGetAffixLevelMap().getMap();
            if (!map.containsKey(key)) {
                throw new IllegalArgumentException();
            }
            return map.get(key);
        }
        
        @Override
        public long getTargetWeaponGuid() {
            return this.targetWeaponGuid_;
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
            GeneratedMessageV3.serializeIntegerMapTo(output, this.internalGetAffixLevelMap(), AffixLevelMapDefaultEntryHolder.defaultEntry, 7);
            if (this.targetWeaponGuid_ != 0L) {
                output.writeUInt64(9, this.targetWeaponGuid_);
            }
            if (this.itemGuid_ != 0L) {
                output.writeUInt64(10, this.itemGuid_);
            }
            this.unknownFields.writeTo(output);
        }
        
        @Override
        public int getSerializedSize() {
            int size = this.memoizedSize;
            if (size != -1) {
                return size;
            }
            size = 0;
            for (final Map.Entry<Integer, Integer> entry : this.internalGetAffixLevelMap().getMap().entrySet()) {
                final MapEntry<Integer, Integer> affixLevelMap__ = AffixLevelMapDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).build();
                size += CodedOutputStream.computeMessageSize(7, affixLevelMap__);
            }
            if (this.targetWeaponGuid_ != 0L) {
                size += CodedOutputStream.computeUInt64Size(9, this.targetWeaponGuid_);
            }
            if (this.itemGuid_ != 0L) {
                size += CodedOutputStream.computeUInt64Size(10, this.itemGuid_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof WeaponAwakenReq)) {
                return super.equals(obj);
            }
            final WeaponAwakenReq other = (WeaponAwakenReq)obj;
            return this.getItemGuid() == other.getItemGuid() && this.internalGetAffixLevelMap().equals(other.internalGetAffixLevelMap()) && this.getTargetWeaponGuid() == other.getTargetWeaponGuid() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 10;
            hash = 53 * hash + Internal.hashLong(this.getItemGuid());
            if (!this.internalGetAffixLevelMap().getMap().isEmpty()) {
                hash = 37 * hash + 7;
                hash = 53 * hash + this.internalGetAffixLevelMap().hashCode();
            }
            hash = 37 * hash + 9;
            hash = 53 * hash + Internal.hashLong(this.getTargetWeaponGuid());
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static WeaponAwakenReq parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return WeaponAwakenReq.PARSER.parseFrom(data);
        }
        
        public static WeaponAwakenReq parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WeaponAwakenReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WeaponAwakenReq parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return WeaponAwakenReq.PARSER.parseFrom(data);
        }
        
        public static WeaponAwakenReq parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WeaponAwakenReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WeaponAwakenReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return WeaponAwakenReq.PARSER.parseFrom(data);
        }
        
        public static WeaponAwakenReq parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WeaponAwakenReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WeaponAwakenReq parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WeaponAwakenReq.PARSER, input);
        }
        
        public static WeaponAwakenReq parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WeaponAwakenReq.PARSER, input, extensionRegistry);
        }
        
        public static WeaponAwakenReq parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(WeaponAwakenReq.PARSER, input);
        }
        
        public static WeaponAwakenReq parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(WeaponAwakenReq.PARSER, input, extensionRegistry);
        }
        
        public static WeaponAwakenReq parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WeaponAwakenReq.PARSER, input);
        }
        
        public static WeaponAwakenReq parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WeaponAwakenReq.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return WeaponAwakenReq.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final WeaponAwakenReq prototype) {
            return WeaponAwakenReq.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == WeaponAwakenReq.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static WeaponAwakenReq getDefaultInstance() {
            return WeaponAwakenReq.DEFAULT_INSTANCE;
        }
        
        public static Parser<WeaponAwakenReq> parser() {
            return WeaponAwakenReq.PARSER;
        }
        
        @Override
        public Parser<WeaponAwakenReq> getParserForType() {
            return WeaponAwakenReq.PARSER;
        }
        
        @Override
        public WeaponAwakenReq getDefaultInstanceForType() {
            return WeaponAwakenReq.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new WeaponAwakenReq();
            PARSER = new AbstractParser<WeaponAwakenReq>() {
                @Override
                public WeaponAwakenReq parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new WeaponAwakenReq(input, extensionRegistry);
                }
            };
        }
        
        private static final class AffixLevelMapDefaultEntryHolder
        {
            static final MapEntry<Integer, Integer> defaultEntry;
            
            static {
                defaultEntry = MapEntry.newDefaultInstance(WeaponAwakenReqOuterClass.internal_static_WeaponAwakenReq_AffixLevelMapEntry_descriptor, WireFormat.FieldType.UINT32, 0, WireFormat.FieldType.UINT32, 0);
            }
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WeaponAwakenReqOrBuilder
        {
            private int bitField0_;
            private long itemGuid_;
            private MapField<Integer, Integer> affixLevelMap_;
            private long targetWeaponGuid_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return WeaponAwakenReqOuterClass.internal_static_WeaponAwakenReq_descriptor;
            }
            
            @Override
            protected MapField internalGetMapField(final int number) {
                switch (number) {
                    case 7: {
                        return this.internalGetAffixLevelMap();
                    }
                    default: {
                        throw new RuntimeException("Invalid map field number: " + number);
                    }
                }
            }
            
            @Override
            protected MapField internalGetMutableMapField(final int number) {
                switch (number) {
                    case 7: {
                        return this.internalGetMutableAffixLevelMap();
                    }
                    default: {
                        throw new RuntimeException("Invalid map field number: " + number);
                    }
                }
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return WeaponAwakenReqOuterClass.internal_static_WeaponAwakenReq_fieldAccessorTable.ensureFieldAccessorsInitialized(WeaponAwakenReq.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (WeaponAwakenReq.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.itemGuid_ = 0L;
                this.internalGetMutableAffixLevelMap().clear();
                this.targetWeaponGuid_ = 0L;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return WeaponAwakenReqOuterClass.internal_static_WeaponAwakenReq_descriptor;
            }
            
            @Override
            public WeaponAwakenReq getDefaultInstanceForType() {
                return WeaponAwakenReq.getDefaultInstance();
            }
            
            @Override
            public WeaponAwakenReq build() {
                final WeaponAwakenReq result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public WeaponAwakenReq buildPartial() {
                final WeaponAwakenReq result = new WeaponAwakenReq(this);
                final int from_bitField0_ = this.bitField0_;
                result.itemGuid_ = this.itemGuid_;
                (result.affixLevelMap_ = this.internalGetAffixLevelMap()).makeImmutable();
                result.targetWeaponGuid_ = this.targetWeaponGuid_;
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
                if (other instanceof WeaponAwakenReq) {
                    return this.mergeFrom((WeaponAwakenReq)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final WeaponAwakenReq other) {
                if (other == WeaponAwakenReq.getDefaultInstance()) {
                    return this;
                }
                if (other.getItemGuid() != 0L) {
                    this.setItemGuid(other.getItemGuid());
                }
                this.internalGetMutableAffixLevelMap().mergeFrom(other.internalGetAffixLevelMap());
                if (other.getTargetWeaponGuid() != 0L) {
                    this.setTargetWeaponGuid(other.getTargetWeaponGuid());
                }
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
                WeaponAwakenReq parsedMessage = null;
                try {
                    parsedMessage = WeaponAwakenReq.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (WeaponAwakenReq)e.getUnfinishedMessage();
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
            public long getItemGuid() {
                return this.itemGuid_;
            }
            
            public Builder setItemGuid(final long value) {
                this.itemGuid_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearItemGuid() {
                this.itemGuid_ = 0L;
                this.onChanged();
                return this;
            }
            
            private MapField<Integer, Integer> internalGetAffixLevelMap() {
                if (this.affixLevelMap_ == null) {
                    return MapField.emptyMapField(AffixLevelMapDefaultEntryHolder.defaultEntry);
                }
                return this.affixLevelMap_;
            }
            
            private MapField<Integer, Integer> internalGetMutableAffixLevelMap() {
                this.onChanged();
                if (this.affixLevelMap_ == null) {
                    this.affixLevelMap_ = MapField.newMapField(AffixLevelMapDefaultEntryHolder.defaultEntry);
                }
                if (!this.affixLevelMap_.isMutable()) {
                    this.affixLevelMap_ = this.affixLevelMap_.copy();
                }
                return this.affixLevelMap_;
            }
            
            @Override
            public int getAffixLevelMapCount() {
                return this.internalGetAffixLevelMap().getMap().size();
            }
            
            @Override
            public boolean containsAffixLevelMap(final int key) {
                return this.internalGetAffixLevelMap().getMap().containsKey(key);
            }
            
            @Deprecated
            @Override
            public Map<Integer, Integer> getAffixLevelMap() {
                return this.getAffixLevelMapMap();
            }
            
            @Override
            public Map<Integer, Integer> getAffixLevelMapMap() {
                return this.internalGetAffixLevelMap().getMap();
            }
            
            @Override
            public int getAffixLevelMapOrDefault(final int key, final int defaultValue) {
                final Map<Integer, Integer> map = this.internalGetAffixLevelMap().getMap();
                return map.containsKey(key) ? map.get(key) : defaultValue;
            }
            
            @Override
            public int getAffixLevelMapOrThrow(final int key) {
                final Map<Integer, Integer> map = this.internalGetAffixLevelMap().getMap();
                if (!map.containsKey(key)) {
                    throw new IllegalArgumentException();
                }
                return map.get(key);
            }
            
            public Builder clearAffixLevelMap() {
                this.internalGetMutableAffixLevelMap().getMutableMap().clear();
                return this;
            }
            
            public Builder removeAffixLevelMap(final int key) {
                this.internalGetMutableAffixLevelMap().getMutableMap().remove(key);
                return this;
            }
            
            @Deprecated
            public Map<Integer, Integer> getMutableAffixLevelMap() {
                return this.internalGetMutableAffixLevelMap().getMutableMap();
            }
            
            public Builder putAffixLevelMap(final int key, final int value) {
                this.internalGetMutableAffixLevelMap().getMutableMap().put(key, value);
                return this;
            }
            
            public Builder putAllAffixLevelMap(final Map<Integer, Integer> values) {
                this.internalGetMutableAffixLevelMap().getMutableMap().putAll(values);
                return this;
            }
            
            @Override
            public long getTargetWeaponGuid() {
                return this.targetWeaponGuid_;
            }
            
            public Builder setTargetWeaponGuid(final long value) {
                this.targetWeaponGuid_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearTargetWeaponGuid() {
                this.targetWeaponGuid_ = 0L;
                this.onChanged();
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
    
    public interface WeaponAwakenReqOrBuilder extends MessageOrBuilder
    {
        long getItemGuid();
        
        int getAffixLevelMapCount();
        
        boolean containsAffixLevelMap(final int p0);
        
        @Deprecated
        Map<Integer, Integer> getAffixLevelMap();
        
        Map<Integer, Integer> getAffixLevelMapMap();
        
        int getAffixLevelMapOrDefault(final int p0, final int p1);
        
        int getAffixLevelMapOrThrow(final int p0);
        
        long getTargetWeaponGuid();
    }
}
