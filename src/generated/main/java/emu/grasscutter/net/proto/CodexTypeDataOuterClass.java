// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import java.util.Collections;
import java.util.Collection;
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
import java.util.List;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MapEntry;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Parser;
import com.google.protobuf.MapField;
import com.google.protobuf.Internal;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class CodexTypeDataOuterClass
{
    private static final Descriptors.Descriptor internal_static_CodexTypeData_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_CodexTypeData_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_CodexTypeData_WeaponMaxPromoteLevelMapEntry_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_CodexTypeData_WeaponMaxPromoteLevelMapEntry_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private CodexTypeDataOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return CodexTypeDataOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0013CodexTypeData.proto\u001a\u000fCodexType.proto\"\u00ef\u0001\n\rCodexTypeData\u0012\u0015\n\rcodex_id_list\u0018\u000e \u0003(\r\u0012R\n\u001cweapon_max_promote_level_map\u0018\u0004 \u0003(\u000b2,.CodexTypeData.WeaponMaxPromoteLevelMapEntry\u0012\u0018\n\u0004type\u0018\r \u0001(\u000e2\n.CodexType\u0012\u0018\n\u0010have_viewed_list\u0018\u0005 \u0003(\b\u001a?\n\u001dWeaponMaxPromoteLevelMapEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\r\u0012\r\n\u0005value\u0018\u0002 \u0001(\r:\u00028\u0001B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        CodexTypeDataOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { CodexTypeOuterClass.getDescriptor() });
        internal_static_CodexTypeData_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_CodexTypeData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(CodexTypeDataOuterClass.internal_static_CodexTypeData_descriptor, new String[] { "CodexIdList", "WeaponMaxPromoteLevelMap", "Type", "HaveViewedList" });
        internal_static_CodexTypeData_WeaponMaxPromoteLevelMapEntry_descriptor = CodexTypeDataOuterClass.internal_static_CodexTypeData_descriptor.getNestedTypes().get(0);
        internal_static_CodexTypeData_WeaponMaxPromoteLevelMapEntry_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(CodexTypeDataOuterClass.internal_static_CodexTypeData_WeaponMaxPromoteLevelMapEntry_descriptor, new String[] { "Key", "Value" });
        CodexTypeOuterClass.getDescriptor();
    }
    
    public static final class CodexTypeData extends GeneratedMessageV3 implements CodexTypeDataOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int CODEX_ID_LIST_FIELD_NUMBER = 14;
        private Internal.IntList codexIdList_;
        private int codexIdListMemoizedSerializedSize;
        public static final int WEAPON_MAX_PROMOTE_LEVEL_MAP_FIELD_NUMBER = 4;
        private MapField<Integer, Integer> weaponMaxPromoteLevelMap_;
        public static final int TYPE_FIELD_NUMBER = 13;
        private int type_;
        public static final int HAVE_VIEWED_LIST_FIELD_NUMBER = 5;
        private Internal.BooleanList haveViewedList_;
        private int haveViewedListMemoizedSerializedSize;
        private byte memoizedIsInitialized;
        private static final CodexTypeData DEFAULT_INSTANCE;
        private static final Parser<CodexTypeData> PARSER;
        
        private CodexTypeData(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.codexIdListMemoizedSerializedSize = -1;
            this.haveViewedListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private CodexTypeData() {
            this.codexIdListMemoizedSerializedSize = -1;
            this.haveViewedListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.codexIdList_ = GeneratedMessageV3.emptyIntList();
            this.type_ = 0;
            this.haveViewedList_ = GeneratedMessageV3.emptyBooleanList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new CodexTypeData();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private CodexTypeData(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 34: {
                            if ((mutable_bitField0_ & 0x2) == 0x0) {
                                this.weaponMaxPromoteLevelMap_ = MapField.newMapField(WeaponMaxPromoteLevelMapDefaultEntryHolder.defaultEntry);
                                mutable_bitField0_ |= 0x2;
                            }
                            final MapEntry<Integer, Integer> weaponMaxPromoteLevelMap__ = input.readMessage(WeaponMaxPromoteLevelMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                            this.weaponMaxPromoteLevelMap_.getMutableMap().put(weaponMaxPromoteLevelMap__.getKey(), weaponMaxPromoteLevelMap__.getValue());
                            continue;
                        }
                        case 40: {
                            if ((mutable_bitField0_ & 0x4) == 0x0) {
                                this.haveViewedList_ = GeneratedMessageV3.newBooleanList();
                                mutable_bitField0_ |= 0x4;
                            }
                            this.haveViewedList_.addBoolean(input.readBool());
                            continue;
                        }
                        case 42: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x4) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.haveViewedList_ = GeneratedMessageV3.newBooleanList();
                                mutable_bitField0_ |= 0x4;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.haveViewedList_.addBoolean(input.readBool());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 104: {
                            final int rawValue = input.readEnum();
                            this.type_ = rawValue;
                            continue;
                        }
                        case 112: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.codexIdList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.codexIdList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 114: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.codexIdList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.codexIdList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
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
                if ((mutable_bitField0_ & 0x4) != 0x0) {
                    this.haveViewedList_.makeImmutable();
                }
                if ((mutable_bitField0_ & 0x1) != 0x0) {
                    this.codexIdList_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return CodexTypeDataOuterClass.internal_static_CodexTypeData_descriptor;
        }
        
        @Override
        protected MapField internalGetMapField(final int number) {
            switch (number) {
                case 4: {
                    return this.internalGetWeaponMaxPromoteLevelMap();
                }
                default: {
                    throw new RuntimeException("Invalid map field number: " + number);
                }
            }
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return CodexTypeDataOuterClass.internal_static_CodexTypeData_fieldAccessorTable.ensureFieldAccessorsInitialized(CodexTypeData.class, Builder.class);
        }
        
        @Override
        public List<Integer> getCodexIdListList() {
            return this.codexIdList_;
        }
        
        @Override
        public int getCodexIdListCount() {
            return this.codexIdList_.size();
        }
        
        @Override
        public int getCodexIdList(final int index) {
            return this.codexIdList_.getInt(index);
        }
        
        private MapField<Integer, Integer> internalGetWeaponMaxPromoteLevelMap() {
            if (this.weaponMaxPromoteLevelMap_ == null) {
                return MapField.emptyMapField(WeaponMaxPromoteLevelMapDefaultEntryHolder.defaultEntry);
            }
            return this.weaponMaxPromoteLevelMap_;
        }
        
        @Override
        public int getWeaponMaxPromoteLevelMapCount() {
            return this.internalGetWeaponMaxPromoteLevelMap().getMap().size();
        }
        
        @Override
        public boolean containsWeaponMaxPromoteLevelMap(final int key) {
            return this.internalGetWeaponMaxPromoteLevelMap().getMap().containsKey(key);
        }
        
        @Deprecated
        @Override
        public Map<Integer, Integer> getWeaponMaxPromoteLevelMap() {
            return this.getWeaponMaxPromoteLevelMapMap();
        }
        
        @Override
        public Map<Integer, Integer> getWeaponMaxPromoteLevelMapMap() {
            return this.internalGetWeaponMaxPromoteLevelMap().getMap();
        }
        
        @Override
        public int getWeaponMaxPromoteLevelMapOrDefault(final int key, final int defaultValue) {
            final Map<Integer, Integer> map = this.internalGetWeaponMaxPromoteLevelMap().getMap();
            return map.containsKey(key) ? map.get(key) : defaultValue;
        }
        
        @Override
        public int getWeaponMaxPromoteLevelMapOrThrow(final int key) {
            final Map<Integer, Integer> map = this.internalGetWeaponMaxPromoteLevelMap().getMap();
            if (!map.containsKey(key)) {
                throw new IllegalArgumentException();
            }
            return map.get(key);
        }
        
        @Override
        public int getTypeValue() {
            return this.type_;
        }
        
        @Override
        public CodexTypeOuterClass.CodexType getType() {
            final CodexTypeOuterClass.CodexType result = CodexTypeOuterClass.CodexType.valueOf(this.type_);
            return (result == null) ? CodexTypeOuterClass.CodexType.UNRECOGNIZED : result;
        }
        
        @Override
        public List<Boolean> getHaveViewedListList() {
            return this.haveViewedList_;
        }
        
        @Override
        public int getHaveViewedListCount() {
            return this.haveViewedList_.size();
        }
        
        @Override
        public boolean getHaveViewedList(final int index) {
            return this.haveViewedList_.getBoolean(index);
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
            this.getSerializedSize();
            GeneratedMessageV3.serializeIntegerMapTo(output, this.internalGetWeaponMaxPromoteLevelMap(), WeaponMaxPromoteLevelMapDefaultEntryHolder.defaultEntry, 4);
            if (this.getHaveViewedListList().size() > 0) {
                output.writeUInt32NoTag(42);
                output.writeUInt32NoTag(this.haveViewedListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.haveViewedList_.size(); ++i) {
                output.writeBoolNoTag(this.haveViewedList_.getBoolean(i));
            }
            if (this.type_ != CodexTypeOuterClass.CodexType.CODEX_TYPE_NONE.getNumber()) {
                output.writeEnum(13, this.type_);
            }
            if (this.getCodexIdListList().size() > 0) {
                output.writeUInt32NoTag(114);
                output.writeUInt32NoTag(this.codexIdListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.codexIdList_.size(); ++i) {
                output.writeUInt32NoTag(this.codexIdList_.getInt(i));
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
            for (final Map.Entry<Integer, Integer> entry : this.internalGetWeaponMaxPromoteLevelMap().getMap().entrySet()) {
                final MapEntry<Integer, Integer> weaponMaxPromoteLevelMap__ = WeaponMaxPromoteLevelMapDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).build();
                size += CodedOutputStream.computeMessageSize(4, weaponMaxPromoteLevelMap__);
            }
            int dataSize = 0;
            dataSize = 1 * this.getHaveViewedListList().size();
            size += dataSize;
            if (!this.getHaveViewedListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.haveViewedListMemoizedSerializedSize = dataSize;
            if (this.type_ != CodexTypeOuterClass.CodexType.CODEX_TYPE_NONE.getNumber()) {
                size += CodedOutputStream.computeEnumSize(13, this.type_);
            }
            dataSize = 0;
            for (int i = 0; i < this.codexIdList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.codexIdList_.getInt(i));
            }
            size += dataSize;
            if (!this.getCodexIdListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.codexIdListMemoizedSerializedSize = dataSize;
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CodexTypeData)) {
                return super.equals(obj);
            }
            final CodexTypeData other = (CodexTypeData)obj;
            return this.getCodexIdListList().equals(other.getCodexIdListList()) && this.internalGetWeaponMaxPromoteLevelMap().equals(other.internalGetWeaponMaxPromoteLevelMap()) && this.type_ == other.type_ && this.getHaveViewedListList().equals(other.getHaveViewedListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getCodexIdListCount() > 0) {
                hash = 37 * hash + 14;
                hash = 53 * hash + this.getCodexIdListList().hashCode();
            }
            if (!this.internalGetWeaponMaxPromoteLevelMap().getMap().isEmpty()) {
                hash = 37 * hash + 4;
                hash = 53 * hash + this.internalGetWeaponMaxPromoteLevelMap().hashCode();
            }
            hash = 37 * hash + 13;
            hash = 53 * hash + this.type_;
            if (this.getHaveViewedListCount() > 0) {
                hash = 37 * hash + 5;
                hash = 53 * hash + this.getHaveViewedListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static CodexTypeData parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return CodexTypeData.PARSER.parseFrom(data);
        }
        
        public static CodexTypeData parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CodexTypeData.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CodexTypeData parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return CodexTypeData.PARSER.parseFrom(data);
        }
        
        public static CodexTypeData parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CodexTypeData.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CodexTypeData parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return CodexTypeData.PARSER.parseFrom(data);
        }
        
        public static CodexTypeData parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CodexTypeData.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CodexTypeData parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CodexTypeData.PARSER, input);
        }
        
        public static CodexTypeData parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CodexTypeData.PARSER, input, extensionRegistry);
        }
        
        public static CodexTypeData parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(CodexTypeData.PARSER, input);
        }
        
        public static CodexTypeData parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(CodexTypeData.PARSER, input, extensionRegistry);
        }
        
        public static CodexTypeData parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CodexTypeData.PARSER, input);
        }
        
        public static CodexTypeData parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CodexTypeData.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return CodexTypeData.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final CodexTypeData prototype) {
            return CodexTypeData.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == CodexTypeData.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static CodexTypeData getDefaultInstance() {
            return CodexTypeData.DEFAULT_INSTANCE;
        }
        
        public static Parser<CodexTypeData> parser() {
            return CodexTypeData.PARSER;
        }
        
        @Override
        public Parser<CodexTypeData> getParserForType() {
            return CodexTypeData.PARSER;
        }
        
        @Override
        public CodexTypeData getDefaultInstanceForType() {
            return CodexTypeData.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new CodexTypeData();
            PARSER = new AbstractParser<CodexTypeData>() {
                @Override
                public CodexTypeData parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new CodexTypeData(input, extensionRegistry);
                }
            };
        }
        
        private static final class WeaponMaxPromoteLevelMapDefaultEntryHolder
        {
            static final MapEntry<Integer, Integer> defaultEntry;
            
            static {
                defaultEntry = MapEntry.newDefaultInstance(CodexTypeDataOuterClass.internal_static_CodexTypeData_WeaponMaxPromoteLevelMapEntry_descriptor, WireFormat.FieldType.UINT32, 0, WireFormat.FieldType.UINT32, 0);
            }
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CodexTypeDataOrBuilder
        {
            private int bitField0_;
            private Internal.IntList codexIdList_;
            private MapField<Integer, Integer> weaponMaxPromoteLevelMap_;
            private int type_;
            private Internal.BooleanList haveViewedList_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return CodexTypeDataOuterClass.internal_static_CodexTypeData_descriptor;
            }
            
            @Override
            protected MapField internalGetMapField(final int number) {
                switch (number) {
                    case 4: {
                        return this.internalGetWeaponMaxPromoteLevelMap();
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
                        return this.internalGetMutableWeaponMaxPromoteLevelMap();
                    }
                    default: {
                        throw new RuntimeException("Invalid map field number: " + number);
                    }
                }
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return CodexTypeDataOuterClass.internal_static_CodexTypeData_fieldAccessorTable.ensureFieldAccessorsInitialized(CodexTypeData.class, Builder.class);
            }
            
            private Builder() {
                this.codexIdList_ = GeneratedMessageV3.emptyIntList();
                this.type_ = 0;
                this.haveViewedList_ = GeneratedMessageV3.emptyBooleanList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.codexIdList_ = GeneratedMessageV3.emptyIntList();
                this.type_ = 0;
                this.haveViewedList_ = GeneratedMessageV3.emptyBooleanList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (CodexTypeData.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.codexIdList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.internalGetMutableWeaponMaxPromoteLevelMap().clear();
                this.type_ = 0;
                this.haveViewedList_ = GeneratedMessageV3.emptyBooleanList();
                this.bitField0_ &= 0xFFFFFFFB;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return CodexTypeDataOuterClass.internal_static_CodexTypeData_descriptor;
            }
            
            @Override
            public CodexTypeData getDefaultInstanceForType() {
                return CodexTypeData.getDefaultInstance();
            }
            
            @Override
            public CodexTypeData build() {
                final CodexTypeData result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public CodexTypeData buildPartial() {
                final CodexTypeData result = new CodexTypeData(this);
                final int from_bitField0_ = this.bitField0_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.codexIdList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.codexIdList_ = this.codexIdList_;
                (result.weaponMaxPromoteLevelMap_ = this.internalGetWeaponMaxPromoteLevelMap()).makeImmutable();
                result.type_ = this.type_;
                if ((this.bitField0_ & 0x4) != 0x0) {
                    this.haveViewedList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFB;
                }
                result.haveViewedList_ = this.haveViewedList_;
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
                if (other instanceof CodexTypeData) {
                    return this.mergeFrom((CodexTypeData)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final CodexTypeData other) {
                if (other == CodexTypeData.getDefaultInstance()) {
                    return this;
                }
                if (!other.codexIdList_.isEmpty()) {
                    if (this.codexIdList_.isEmpty()) {
                        this.codexIdList_ = other.codexIdList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureCodexIdListIsMutable();
                        this.codexIdList_.addAll(other.codexIdList_);
                    }
                    this.onChanged();
                }
                this.internalGetMutableWeaponMaxPromoteLevelMap().mergeFrom(other.internalGetWeaponMaxPromoteLevelMap());
                if (other.type_ != 0) {
                    this.setTypeValue(other.getTypeValue());
                }
                if (!other.haveViewedList_.isEmpty()) {
                    if (this.haveViewedList_.isEmpty()) {
                        this.haveViewedList_ = other.haveViewedList_;
                        this.bitField0_ &= 0xFFFFFFFB;
                    }
                    else {
                        this.ensureHaveViewedListIsMutable();
                        this.haveViewedList_.addAll(other.haveViewedList_);
                    }
                    this.onChanged();
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
                CodexTypeData parsedMessage = null;
                try {
                    parsedMessage = CodexTypeData.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (CodexTypeData)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureCodexIdListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.codexIdList_ = GeneratedMessageV3.mutableCopy(this.codexIdList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Integer> getCodexIdListList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.codexIdList_) : this.codexIdList_;
            }
            
            @Override
            public int getCodexIdListCount() {
                return this.codexIdList_.size();
            }
            
            @Override
            public int getCodexIdList(final int index) {
                return this.codexIdList_.getInt(index);
            }
            
            public Builder setCodexIdList(final int index, final int value) {
                this.ensureCodexIdListIsMutable();
                this.codexIdList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addCodexIdList(final int value) {
                this.ensureCodexIdListIsMutable();
                this.codexIdList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllCodexIdList(final Iterable<? extends Integer> values) {
                this.ensureCodexIdListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.codexIdList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearCodexIdList() {
                this.codexIdList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.onChanged();
                return this;
            }
            
            private MapField<Integer, Integer> internalGetWeaponMaxPromoteLevelMap() {
                if (this.weaponMaxPromoteLevelMap_ == null) {
                    return MapField.emptyMapField(WeaponMaxPromoteLevelMapDefaultEntryHolder.defaultEntry);
                }
                return this.weaponMaxPromoteLevelMap_;
            }
            
            private MapField<Integer, Integer> internalGetMutableWeaponMaxPromoteLevelMap() {
                this.onChanged();
                if (this.weaponMaxPromoteLevelMap_ == null) {
                    this.weaponMaxPromoteLevelMap_ = MapField.newMapField(WeaponMaxPromoteLevelMapDefaultEntryHolder.defaultEntry);
                }
                if (!this.weaponMaxPromoteLevelMap_.isMutable()) {
                    this.weaponMaxPromoteLevelMap_ = this.weaponMaxPromoteLevelMap_.copy();
                }
                return this.weaponMaxPromoteLevelMap_;
            }
            
            @Override
            public int getWeaponMaxPromoteLevelMapCount() {
                return this.internalGetWeaponMaxPromoteLevelMap().getMap().size();
            }
            
            @Override
            public boolean containsWeaponMaxPromoteLevelMap(final int key) {
                return this.internalGetWeaponMaxPromoteLevelMap().getMap().containsKey(key);
            }
            
            @Deprecated
            @Override
            public Map<Integer, Integer> getWeaponMaxPromoteLevelMap() {
                return this.getWeaponMaxPromoteLevelMapMap();
            }
            
            @Override
            public Map<Integer, Integer> getWeaponMaxPromoteLevelMapMap() {
                return this.internalGetWeaponMaxPromoteLevelMap().getMap();
            }
            
            @Override
            public int getWeaponMaxPromoteLevelMapOrDefault(final int key, final int defaultValue) {
                final Map<Integer, Integer> map = this.internalGetWeaponMaxPromoteLevelMap().getMap();
                return map.containsKey(key) ? map.get(key) : defaultValue;
            }
            
            @Override
            public int getWeaponMaxPromoteLevelMapOrThrow(final int key) {
                final Map<Integer, Integer> map = this.internalGetWeaponMaxPromoteLevelMap().getMap();
                if (!map.containsKey(key)) {
                    throw new IllegalArgumentException();
                }
                return map.get(key);
            }
            
            public Builder clearWeaponMaxPromoteLevelMap() {
                this.internalGetMutableWeaponMaxPromoteLevelMap().getMutableMap().clear();
                return this;
            }
            
            public Builder removeWeaponMaxPromoteLevelMap(final int key) {
                this.internalGetMutableWeaponMaxPromoteLevelMap().getMutableMap().remove(key);
                return this;
            }
            
            @Deprecated
            public Map<Integer, Integer> getMutableWeaponMaxPromoteLevelMap() {
                return this.internalGetMutableWeaponMaxPromoteLevelMap().getMutableMap();
            }
            
            public Builder putWeaponMaxPromoteLevelMap(final int key, final int value) {
                this.internalGetMutableWeaponMaxPromoteLevelMap().getMutableMap().put(key, value);
                return this;
            }
            
            public Builder putAllWeaponMaxPromoteLevelMap(final Map<Integer, Integer> values) {
                this.internalGetMutableWeaponMaxPromoteLevelMap().getMutableMap().putAll(values);
                return this;
            }
            
            @Override
            public int getTypeValue() {
                return this.type_;
            }
            
            public Builder setTypeValue(final int value) {
                this.type_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public CodexTypeOuterClass.CodexType getType() {
                final CodexTypeOuterClass.CodexType result = CodexTypeOuterClass.CodexType.valueOf(this.type_);
                return (result == null) ? CodexTypeOuterClass.CodexType.UNRECOGNIZED : result;
            }
            
            public Builder setType(final CodexTypeOuterClass.CodexType value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.type_ = value.getNumber();
                this.onChanged();
                return this;
            }
            
            public Builder clearType() {
                this.type_ = 0;
                this.onChanged();
                return this;
            }
            
            private void ensureHaveViewedListIsMutable() {
                if ((this.bitField0_ & 0x4) == 0x0) {
                    this.haveViewedList_ = GeneratedMessageV3.mutableCopy(this.haveViewedList_);
                    this.bitField0_ |= 0x4;
                }
            }
            
            @Override
            public List<Boolean> getHaveViewedListList() {
                return ((this.bitField0_ & 0x4) != 0x0) ? Collections.unmodifiableList((List<? extends Boolean>)this.haveViewedList_) : this.haveViewedList_;
            }
            
            @Override
            public int getHaveViewedListCount() {
                return this.haveViewedList_.size();
            }
            
            @Override
            public boolean getHaveViewedList(final int index) {
                return this.haveViewedList_.getBoolean(index);
            }
            
            public Builder setHaveViewedList(final int index, final boolean value) {
                this.ensureHaveViewedListIsMutable();
                this.haveViewedList_.setBoolean(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addHaveViewedList(final boolean value) {
                this.ensureHaveViewedListIsMutable();
                this.haveViewedList_.addBoolean(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllHaveViewedList(final Iterable<? extends Boolean> values) {
                this.ensureHaveViewedListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.haveViewedList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearHaveViewedList() {
                this.haveViewedList_ = GeneratedMessageV3.emptyBooleanList();
                this.bitField0_ &= 0xFFFFFFFB;
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
    
    public interface CodexTypeDataOrBuilder extends MessageOrBuilder
    {
        List<Integer> getCodexIdListList();
        
        int getCodexIdListCount();
        
        int getCodexIdList(final int p0);
        
        int getWeaponMaxPromoteLevelMapCount();
        
        boolean containsWeaponMaxPromoteLevelMap(final int p0);
        
        @Deprecated
        Map<Integer, Integer> getWeaponMaxPromoteLevelMap();
        
        Map<Integer, Integer> getWeaponMaxPromoteLevelMapMap();
        
        int getWeaponMaxPromoteLevelMapOrDefault(final int p0, final int p1);
        
        int getWeaponMaxPromoteLevelMapOrThrow(final int p0);
        
        int getTypeValue();
        
        CodexTypeOuterClass.CodexType getType();
        
        List<Boolean> getHaveViewedListList();
        
        int getHaveViewedListCount();
        
        boolean getHaveViewedList(final int p0);
    }
}
