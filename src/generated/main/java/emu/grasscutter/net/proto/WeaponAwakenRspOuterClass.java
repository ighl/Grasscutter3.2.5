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

public final class WeaponAwakenRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_WeaponAwakenRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_WeaponAwakenRsp_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_WeaponAwakenRsp_OldAffixLevelMapEntry_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_WeaponAwakenRsp_OldAffixLevelMapEntry_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_WeaponAwakenRsp_CurAffixLevelMapEntry_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_WeaponAwakenRsp_CurAffixLevelMapEntry_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private WeaponAwakenRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return WeaponAwakenRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0015WeaponAwakenRsp.proto\"\u00f3\u0002\n\u000fWeaponAwakenRsp\u0012\u000f\n\u0007retcode\u0018\t \u0001(\u0005\u0012\u0013\n\u000bavatar_guid\u0018\n \u0001(\u0004\u0012C\n\u0013old_affix_level_map\u0018\u0004 \u0003(\u000b2&.WeaponAwakenRsp.OldAffixLevelMapEntry\u0012\"\n\u001atarget_weapon_awaken_level\u0018\u0002 \u0001(\r\u0012\u001a\n\u0012target_weapon_guid\u0018\u000f \u0001(\u0004\u0012C\n\u0013cur_affix_level_map\u0018\u000b \u0003(\u000b2&.WeaponAwakenRsp.CurAffixLevelMapEntry\u001a7\n\u0015OldAffixLevelMapEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\r\u0012\r\n\u0005value\u0018\u0002 \u0001(\r:\u00028\u0001\u001a7\n\u0015CurAffixLevelMapEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\r\u0012\r\n\u0005value\u0018\u0002 \u0001(\r:\u00028\u0001B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        WeaponAwakenRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_WeaponAwakenRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_WeaponAwakenRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(WeaponAwakenRspOuterClass.internal_static_WeaponAwakenRsp_descriptor, new String[] { "Retcode", "AvatarGuid", "OldAffixLevelMap", "TargetWeaponAwakenLevel", "TargetWeaponGuid", "CurAffixLevelMap" });
        internal_static_WeaponAwakenRsp_OldAffixLevelMapEntry_descriptor = WeaponAwakenRspOuterClass.internal_static_WeaponAwakenRsp_descriptor.getNestedTypes().get(0);
        internal_static_WeaponAwakenRsp_OldAffixLevelMapEntry_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(WeaponAwakenRspOuterClass.internal_static_WeaponAwakenRsp_OldAffixLevelMapEntry_descriptor, new String[] { "Key", "Value" });
        internal_static_WeaponAwakenRsp_CurAffixLevelMapEntry_descriptor = WeaponAwakenRspOuterClass.internal_static_WeaponAwakenRsp_descriptor.getNestedTypes().get(1);
        internal_static_WeaponAwakenRsp_CurAffixLevelMapEntry_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(WeaponAwakenRspOuterClass.internal_static_WeaponAwakenRsp_CurAffixLevelMapEntry_descriptor, new String[] { "Key", "Value" });
    }
    
    public static final class WeaponAwakenRsp extends GeneratedMessageV3 implements WeaponAwakenRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int RETCODE_FIELD_NUMBER = 9;
        private int retcode_;
        public static final int AVATAR_GUID_FIELD_NUMBER = 10;
        private long avatarGuid_;
        public static final int OLD_AFFIX_LEVEL_MAP_FIELD_NUMBER = 4;
        private MapField<Integer, Integer> oldAffixLevelMap_;
        public static final int TARGET_WEAPON_AWAKEN_LEVEL_FIELD_NUMBER = 2;
        private int targetWeaponAwakenLevel_;
        public static final int TARGET_WEAPON_GUID_FIELD_NUMBER = 15;
        private long targetWeaponGuid_;
        public static final int CUR_AFFIX_LEVEL_MAP_FIELD_NUMBER = 11;
        private MapField<Integer, Integer> curAffixLevelMap_;
        private byte memoizedIsInitialized;
        private static final WeaponAwakenRsp DEFAULT_INSTANCE;
        private static final Parser<WeaponAwakenRsp> PARSER;
        
        private WeaponAwakenRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private WeaponAwakenRsp() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new WeaponAwakenRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private WeaponAwakenRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 16: {
                            this.targetWeaponAwakenLevel_ = input.readUInt32();
                            continue;
                        }
                        case 34: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.oldAffixLevelMap_ = MapField.newMapField(OldAffixLevelMapDefaultEntryHolder.defaultEntry);
                                mutable_bitField0_ |= 0x1;
                            }
                            final MapEntry<Integer, Integer> oldAffixLevelMap__ = input.readMessage(OldAffixLevelMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                            this.oldAffixLevelMap_.getMutableMap().put(oldAffixLevelMap__.getKey(), oldAffixLevelMap__.getValue());
                            continue;
                        }
                        case 72: {
                            this.retcode_ = input.readInt32();
                            continue;
                        }
                        case 80: {
                            this.avatarGuid_ = input.readUInt64();
                            continue;
                        }
                        case 90: {
                            if ((mutable_bitField0_ & 0x2) == 0x0) {
                                this.curAffixLevelMap_ = MapField.newMapField(CurAffixLevelMapDefaultEntryHolder.defaultEntry);
                                mutable_bitField0_ |= 0x2;
                            }
                            final MapEntry<Integer, Integer> curAffixLevelMap__ = input.readMessage(CurAffixLevelMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                            this.curAffixLevelMap_.getMutableMap().put(curAffixLevelMap__.getKey(), curAffixLevelMap__.getValue());
                            continue;
                        }
                        case 120: {
                            this.targetWeaponGuid_ = input.readUInt64();
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
            return WeaponAwakenRspOuterClass.internal_static_WeaponAwakenRsp_descriptor;
        }
        
        @Override
        protected MapField internalGetMapField(final int number) {
            switch (number) {
                case 4: {
                    return this.internalGetOldAffixLevelMap();
                }
                case 11: {
                    return this.internalGetCurAffixLevelMap();
                }
                default: {
                    throw new RuntimeException("Invalid map field number: " + number);
                }
            }
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return WeaponAwakenRspOuterClass.internal_static_WeaponAwakenRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(WeaponAwakenRsp.class, Builder.class);
        }
        
        @Override
        public int getRetcode() {
            return this.retcode_;
        }
        
        @Override
        public long getAvatarGuid() {
            return this.avatarGuid_;
        }
        
        private MapField<Integer, Integer> internalGetOldAffixLevelMap() {
            if (this.oldAffixLevelMap_ == null) {
                return MapField.emptyMapField(OldAffixLevelMapDefaultEntryHolder.defaultEntry);
            }
            return this.oldAffixLevelMap_;
        }
        
        @Override
        public int getOldAffixLevelMapCount() {
            return this.internalGetOldAffixLevelMap().getMap().size();
        }
        
        @Override
        public boolean containsOldAffixLevelMap(final int key) {
            return this.internalGetOldAffixLevelMap().getMap().containsKey(key);
        }
        
        @Deprecated
        @Override
        public Map<Integer, Integer> getOldAffixLevelMap() {
            return this.getOldAffixLevelMapMap();
        }
        
        @Override
        public Map<Integer, Integer> getOldAffixLevelMapMap() {
            return this.internalGetOldAffixLevelMap().getMap();
        }
        
        @Override
        public int getOldAffixLevelMapOrDefault(final int key, final int defaultValue) {
            final Map<Integer, Integer> map = this.internalGetOldAffixLevelMap().getMap();
            return map.containsKey(key) ? map.get(key) : defaultValue;
        }
        
        @Override
        public int getOldAffixLevelMapOrThrow(final int key) {
            final Map<Integer, Integer> map = this.internalGetOldAffixLevelMap().getMap();
            if (!map.containsKey(key)) {
                throw new IllegalArgumentException();
            }
            return map.get(key);
        }
        
        @Override
        public int getTargetWeaponAwakenLevel() {
            return this.targetWeaponAwakenLevel_;
        }
        
        @Override
        public long getTargetWeaponGuid() {
            return this.targetWeaponGuid_;
        }
        
        private MapField<Integer, Integer> internalGetCurAffixLevelMap() {
            if (this.curAffixLevelMap_ == null) {
                return MapField.emptyMapField(CurAffixLevelMapDefaultEntryHolder.defaultEntry);
            }
            return this.curAffixLevelMap_;
        }
        
        @Override
        public int getCurAffixLevelMapCount() {
            return this.internalGetCurAffixLevelMap().getMap().size();
        }
        
        @Override
        public boolean containsCurAffixLevelMap(final int key) {
            return this.internalGetCurAffixLevelMap().getMap().containsKey(key);
        }
        
        @Deprecated
        @Override
        public Map<Integer, Integer> getCurAffixLevelMap() {
            return this.getCurAffixLevelMapMap();
        }
        
        @Override
        public Map<Integer, Integer> getCurAffixLevelMapMap() {
            return this.internalGetCurAffixLevelMap().getMap();
        }
        
        @Override
        public int getCurAffixLevelMapOrDefault(final int key, final int defaultValue) {
            final Map<Integer, Integer> map = this.internalGetCurAffixLevelMap().getMap();
            return map.containsKey(key) ? map.get(key) : defaultValue;
        }
        
        @Override
        public int getCurAffixLevelMapOrThrow(final int key) {
            final Map<Integer, Integer> map = this.internalGetCurAffixLevelMap().getMap();
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
            if (this.targetWeaponAwakenLevel_ != 0) {
                output.writeUInt32(2, this.targetWeaponAwakenLevel_);
            }
            GeneratedMessageV3.serializeIntegerMapTo(output, this.internalGetOldAffixLevelMap(), OldAffixLevelMapDefaultEntryHolder.defaultEntry, 4);
            if (this.retcode_ != 0) {
                output.writeInt32(9, this.retcode_);
            }
            if (this.avatarGuid_ != 0L) {
                output.writeUInt64(10, this.avatarGuid_);
            }
            GeneratedMessageV3.serializeIntegerMapTo(output, this.internalGetCurAffixLevelMap(), CurAffixLevelMapDefaultEntryHolder.defaultEntry, 11);
            if (this.targetWeaponGuid_ != 0L) {
                output.writeUInt64(15, this.targetWeaponGuid_);
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
            if (this.targetWeaponAwakenLevel_ != 0) {
                size += CodedOutputStream.computeUInt32Size(2, this.targetWeaponAwakenLevel_);
            }
            for (final Map.Entry<Integer, Integer> entry : this.internalGetOldAffixLevelMap().getMap().entrySet()) {
                final MapEntry<Integer, Integer> oldAffixLevelMap__ = OldAffixLevelMapDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).build();
                size += CodedOutputStream.computeMessageSize(4, oldAffixLevelMap__);
            }
            if (this.retcode_ != 0) {
                size += CodedOutputStream.computeInt32Size(9, this.retcode_);
            }
            if (this.avatarGuid_ != 0L) {
                size += CodedOutputStream.computeUInt64Size(10, this.avatarGuid_);
            }
            for (final Map.Entry<Integer, Integer> entry : this.internalGetCurAffixLevelMap().getMap().entrySet()) {
                final MapEntry<Integer, Integer> curAffixLevelMap__ = CurAffixLevelMapDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).build();
                size += CodedOutputStream.computeMessageSize(11, curAffixLevelMap__);
            }
            if (this.targetWeaponGuid_ != 0L) {
                size += CodedOutputStream.computeUInt64Size(15, this.targetWeaponGuid_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof WeaponAwakenRsp)) {
                return super.equals(obj);
            }
            final WeaponAwakenRsp other = (WeaponAwakenRsp)obj;
            return this.getRetcode() == other.getRetcode() && this.getAvatarGuid() == other.getAvatarGuid() && this.internalGetOldAffixLevelMap().equals(other.internalGetOldAffixLevelMap()) && this.getTargetWeaponAwakenLevel() == other.getTargetWeaponAwakenLevel() && this.getTargetWeaponGuid() == other.getTargetWeaponGuid() && this.internalGetCurAffixLevelMap().equals(other.internalGetCurAffixLevelMap()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 9;
            hash = 53 * hash + this.getRetcode();
            hash = 37 * hash + 10;
            hash = 53 * hash + Internal.hashLong(this.getAvatarGuid());
            if (!this.internalGetOldAffixLevelMap().getMap().isEmpty()) {
                hash = 37 * hash + 4;
                hash = 53 * hash + this.internalGetOldAffixLevelMap().hashCode();
            }
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getTargetWeaponAwakenLevel();
            hash = 37 * hash + 15;
            hash = 53 * hash + Internal.hashLong(this.getTargetWeaponGuid());
            if (!this.internalGetCurAffixLevelMap().getMap().isEmpty()) {
                hash = 37 * hash + 11;
                hash = 53 * hash + this.internalGetCurAffixLevelMap().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static WeaponAwakenRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return WeaponAwakenRsp.PARSER.parseFrom(data);
        }
        
        public static WeaponAwakenRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WeaponAwakenRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WeaponAwakenRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return WeaponAwakenRsp.PARSER.parseFrom(data);
        }
        
        public static WeaponAwakenRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WeaponAwakenRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WeaponAwakenRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return WeaponAwakenRsp.PARSER.parseFrom(data);
        }
        
        public static WeaponAwakenRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WeaponAwakenRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WeaponAwakenRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WeaponAwakenRsp.PARSER, input);
        }
        
        public static WeaponAwakenRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WeaponAwakenRsp.PARSER, input, extensionRegistry);
        }
        
        public static WeaponAwakenRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(WeaponAwakenRsp.PARSER, input);
        }
        
        public static WeaponAwakenRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(WeaponAwakenRsp.PARSER, input, extensionRegistry);
        }
        
        public static WeaponAwakenRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WeaponAwakenRsp.PARSER, input);
        }
        
        public static WeaponAwakenRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WeaponAwakenRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return WeaponAwakenRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final WeaponAwakenRsp prototype) {
            return WeaponAwakenRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == WeaponAwakenRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static WeaponAwakenRsp getDefaultInstance() {
            return WeaponAwakenRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<WeaponAwakenRsp> parser() {
            return WeaponAwakenRsp.PARSER;
        }
        
        @Override
        public Parser<WeaponAwakenRsp> getParserForType() {
            return WeaponAwakenRsp.PARSER;
        }
        
        @Override
        public WeaponAwakenRsp getDefaultInstanceForType() {
            return WeaponAwakenRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new WeaponAwakenRsp();
            PARSER = new AbstractParser<WeaponAwakenRsp>() {
                @Override
                public WeaponAwakenRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new WeaponAwakenRsp(input, extensionRegistry);
                }
            };
        }
        
        private static final class OldAffixLevelMapDefaultEntryHolder
        {
            static final MapEntry<Integer, Integer> defaultEntry;
            
            static {
                defaultEntry = MapEntry.newDefaultInstance(WeaponAwakenRspOuterClass.internal_static_WeaponAwakenRsp_OldAffixLevelMapEntry_descriptor, WireFormat.FieldType.UINT32, 0, WireFormat.FieldType.UINT32, 0);
            }
        }
        
        private static final class CurAffixLevelMapDefaultEntryHolder
        {
            static final MapEntry<Integer, Integer> defaultEntry;
            
            static {
                defaultEntry = MapEntry.newDefaultInstance(WeaponAwakenRspOuterClass.internal_static_WeaponAwakenRsp_CurAffixLevelMapEntry_descriptor, WireFormat.FieldType.UINT32, 0, WireFormat.FieldType.UINT32, 0);
            }
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WeaponAwakenRspOrBuilder
        {
            private int bitField0_;
            private int retcode_;
            private long avatarGuid_;
            private MapField<Integer, Integer> oldAffixLevelMap_;
            private int targetWeaponAwakenLevel_;
            private long targetWeaponGuid_;
            private MapField<Integer, Integer> curAffixLevelMap_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return WeaponAwakenRspOuterClass.internal_static_WeaponAwakenRsp_descriptor;
            }
            
            @Override
            protected MapField internalGetMapField(final int number) {
                switch (number) {
                    case 4: {
                        return this.internalGetOldAffixLevelMap();
                    }
                    case 11: {
                        return this.internalGetCurAffixLevelMap();
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
                        return this.internalGetMutableOldAffixLevelMap();
                    }
                    case 11: {
                        return this.internalGetMutableCurAffixLevelMap();
                    }
                    default: {
                        throw new RuntimeException("Invalid map field number: " + number);
                    }
                }
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return WeaponAwakenRspOuterClass.internal_static_WeaponAwakenRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(WeaponAwakenRsp.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (WeaponAwakenRsp.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.retcode_ = 0;
                this.avatarGuid_ = 0L;
                this.internalGetMutableOldAffixLevelMap().clear();
                this.targetWeaponAwakenLevel_ = 0;
                this.targetWeaponGuid_ = 0L;
                this.internalGetMutableCurAffixLevelMap().clear();
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return WeaponAwakenRspOuterClass.internal_static_WeaponAwakenRsp_descriptor;
            }
            
            @Override
            public WeaponAwakenRsp getDefaultInstanceForType() {
                return WeaponAwakenRsp.getDefaultInstance();
            }
            
            @Override
            public WeaponAwakenRsp build() {
                final WeaponAwakenRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public WeaponAwakenRsp buildPartial() {
                final WeaponAwakenRsp result = new WeaponAwakenRsp(this);
                final int from_bitField0_ = this.bitField0_;
                result.retcode_ = this.retcode_;
                result.avatarGuid_ = this.avatarGuid_;
                (result.oldAffixLevelMap_ = this.internalGetOldAffixLevelMap()).makeImmutable();
                result.targetWeaponAwakenLevel_ = this.targetWeaponAwakenLevel_;
                result.targetWeaponGuid_ = this.targetWeaponGuid_;
                (result.curAffixLevelMap_ = this.internalGetCurAffixLevelMap()).makeImmutable();
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
                if (other instanceof WeaponAwakenRsp) {
                    return this.mergeFrom((WeaponAwakenRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final WeaponAwakenRsp other) {
                if (other == WeaponAwakenRsp.getDefaultInstance()) {
                    return this;
                }
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
                }
                if (other.getAvatarGuid() != 0L) {
                    this.setAvatarGuid(other.getAvatarGuid());
                }
                this.internalGetMutableOldAffixLevelMap().mergeFrom(other.internalGetOldAffixLevelMap());
                if (other.getTargetWeaponAwakenLevel() != 0) {
                    this.setTargetWeaponAwakenLevel(other.getTargetWeaponAwakenLevel());
                }
                if (other.getTargetWeaponGuid() != 0L) {
                    this.setTargetWeaponGuid(other.getTargetWeaponGuid());
                }
                this.internalGetMutableCurAffixLevelMap().mergeFrom(other.internalGetCurAffixLevelMap());
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
                WeaponAwakenRsp parsedMessage = null;
                try {
                    parsedMessage = WeaponAwakenRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (WeaponAwakenRsp)e.getUnfinishedMessage();
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
            public int getRetcode() {
                return this.retcode_;
            }
            
            public Builder setRetcode(final int value) {
                this.retcode_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearRetcode() {
                this.retcode_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public long getAvatarGuid() {
                return this.avatarGuid_;
            }
            
            public Builder setAvatarGuid(final long value) {
                this.avatarGuid_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearAvatarGuid() {
                this.avatarGuid_ = 0L;
                this.onChanged();
                return this;
            }
            
            private MapField<Integer, Integer> internalGetOldAffixLevelMap() {
                if (this.oldAffixLevelMap_ == null) {
                    return MapField.emptyMapField(OldAffixLevelMapDefaultEntryHolder.defaultEntry);
                }
                return this.oldAffixLevelMap_;
            }
            
            private MapField<Integer, Integer> internalGetMutableOldAffixLevelMap() {
                this.onChanged();
                if (this.oldAffixLevelMap_ == null) {
                    this.oldAffixLevelMap_ = MapField.newMapField(OldAffixLevelMapDefaultEntryHolder.defaultEntry);
                }
                if (!this.oldAffixLevelMap_.isMutable()) {
                    this.oldAffixLevelMap_ = this.oldAffixLevelMap_.copy();
                }
                return this.oldAffixLevelMap_;
            }
            
            @Override
            public int getOldAffixLevelMapCount() {
                return this.internalGetOldAffixLevelMap().getMap().size();
            }
            
            @Override
            public boolean containsOldAffixLevelMap(final int key) {
                return this.internalGetOldAffixLevelMap().getMap().containsKey(key);
            }
            
            @Deprecated
            @Override
            public Map<Integer, Integer> getOldAffixLevelMap() {
                return this.getOldAffixLevelMapMap();
            }
            
            @Override
            public Map<Integer, Integer> getOldAffixLevelMapMap() {
                return this.internalGetOldAffixLevelMap().getMap();
            }
            
            @Override
            public int getOldAffixLevelMapOrDefault(final int key, final int defaultValue) {
                final Map<Integer, Integer> map = this.internalGetOldAffixLevelMap().getMap();
                return map.containsKey(key) ? map.get(key) : defaultValue;
            }
            
            @Override
            public int getOldAffixLevelMapOrThrow(final int key) {
                final Map<Integer, Integer> map = this.internalGetOldAffixLevelMap().getMap();
                if (!map.containsKey(key)) {
                    throw new IllegalArgumentException();
                }
                return map.get(key);
            }
            
            public Builder clearOldAffixLevelMap() {
                this.internalGetMutableOldAffixLevelMap().getMutableMap().clear();
                return this;
            }
            
            public Builder removeOldAffixLevelMap(final int key) {
                this.internalGetMutableOldAffixLevelMap().getMutableMap().remove(key);
                return this;
            }
            
            @Deprecated
            public Map<Integer, Integer> getMutableOldAffixLevelMap() {
                return this.internalGetMutableOldAffixLevelMap().getMutableMap();
            }
            
            public Builder putOldAffixLevelMap(final int key, final int value) {
                this.internalGetMutableOldAffixLevelMap().getMutableMap().put(key, value);
                return this;
            }
            
            public Builder putAllOldAffixLevelMap(final Map<Integer, Integer> values) {
                this.internalGetMutableOldAffixLevelMap().getMutableMap().putAll(values);
                return this;
            }
            
            @Override
            public int getTargetWeaponAwakenLevel() {
                return this.targetWeaponAwakenLevel_;
            }
            
            public Builder setTargetWeaponAwakenLevel(final int value) {
                this.targetWeaponAwakenLevel_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearTargetWeaponAwakenLevel() {
                this.targetWeaponAwakenLevel_ = 0;
                this.onChanged();
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
            
            private MapField<Integer, Integer> internalGetCurAffixLevelMap() {
                if (this.curAffixLevelMap_ == null) {
                    return MapField.emptyMapField(CurAffixLevelMapDefaultEntryHolder.defaultEntry);
                }
                return this.curAffixLevelMap_;
            }
            
            private MapField<Integer, Integer> internalGetMutableCurAffixLevelMap() {
                this.onChanged();
                if (this.curAffixLevelMap_ == null) {
                    this.curAffixLevelMap_ = MapField.newMapField(CurAffixLevelMapDefaultEntryHolder.defaultEntry);
                }
                if (!this.curAffixLevelMap_.isMutable()) {
                    this.curAffixLevelMap_ = this.curAffixLevelMap_.copy();
                }
                return this.curAffixLevelMap_;
            }
            
            @Override
            public int getCurAffixLevelMapCount() {
                return this.internalGetCurAffixLevelMap().getMap().size();
            }
            
            @Override
            public boolean containsCurAffixLevelMap(final int key) {
                return this.internalGetCurAffixLevelMap().getMap().containsKey(key);
            }
            
            @Deprecated
            @Override
            public Map<Integer, Integer> getCurAffixLevelMap() {
                return this.getCurAffixLevelMapMap();
            }
            
            @Override
            public Map<Integer, Integer> getCurAffixLevelMapMap() {
                return this.internalGetCurAffixLevelMap().getMap();
            }
            
            @Override
            public int getCurAffixLevelMapOrDefault(final int key, final int defaultValue) {
                final Map<Integer, Integer> map = this.internalGetCurAffixLevelMap().getMap();
                return map.containsKey(key) ? map.get(key) : defaultValue;
            }
            
            @Override
            public int getCurAffixLevelMapOrThrow(final int key) {
                final Map<Integer, Integer> map = this.internalGetCurAffixLevelMap().getMap();
                if (!map.containsKey(key)) {
                    throw new IllegalArgumentException();
                }
                return map.get(key);
            }
            
            public Builder clearCurAffixLevelMap() {
                this.internalGetMutableCurAffixLevelMap().getMutableMap().clear();
                return this;
            }
            
            public Builder removeCurAffixLevelMap(final int key) {
                this.internalGetMutableCurAffixLevelMap().getMutableMap().remove(key);
                return this;
            }
            
            @Deprecated
            public Map<Integer, Integer> getMutableCurAffixLevelMap() {
                return this.internalGetMutableCurAffixLevelMap().getMutableMap();
            }
            
            public Builder putCurAffixLevelMap(final int key, final int value) {
                this.internalGetMutableCurAffixLevelMap().getMutableMap().put(key, value);
                return this;
            }
            
            public Builder putAllCurAffixLevelMap(final Map<Integer, Integer> values) {
                this.internalGetMutableCurAffixLevelMap().getMutableMap().putAll(values);
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
    
    public interface WeaponAwakenRspOrBuilder extends MessageOrBuilder
    {
        int getRetcode();
        
        long getAvatarGuid();
        
        int getOldAffixLevelMapCount();
        
        boolean containsOldAffixLevelMap(final int p0);
        
        @Deprecated
        Map<Integer, Integer> getOldAffixLevelMap();
        
        Map<Integer, Integer> getOldAffixLevelMapMap();
        
        int getOldAffixLevelMapOrDefault(final int p0, final int p1);
        
        int getOldAffixLevelMapOrThrow(final int p0);
        
        int getTargetWeaponAwakenLevel();
        
        long getTargetWeaponGuid();
        
        int getCurAffixLevelMapCount();
        
        boolean containsCurAffixLevelMap(final int p0);
        
        @Deprecated
        Map<Integer, Integer> getCurAffixLevelMap();
        
        Map<Integer, Integer> getCurAffixLevelMapMap();
        
        int getCurAffixLevelMapOrDefault(final int p0, final int p1);
        
        int getCurAffixLevelMapOrThrow(final int p0);
    }
}
