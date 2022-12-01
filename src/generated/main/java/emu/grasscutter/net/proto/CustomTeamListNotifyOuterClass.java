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

public final class CustomTeamListNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_CustomTeamListNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_CustomTeamListNotify_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_CustomTeamListNotify_AvatarTeamMapEntry_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_CustomTeamListNotify_AvatarTeamMapEntry_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private CustomTeamListNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return CustomTeamListNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001aCustomTeamListNotify.proto\u001a\u0010AvatarTeam.proto\"\u00d4\u0001\n\u0014CustomTeamListNotify\u0012\u001d\n\u0015temp_avatar_guid_list\u0018\u0006 \u0003(\u0004\u0012A\n\u000favatar_team_map\u0018\u0003 \u0003(\u000b2(.CustomTeamListNotify.AvatarTeamMapEntry\u0012\u0017\n\u000fcustom_team_ids\u0018\u0001 \u0003(\r\u001aA\n\u0012AvatarTeamMapEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\r\u0012\u001a\n\u0005value\u0018\u0002 \u0001(\u000b2\u000b.AvatarTeam:\u00028\u0001B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        CustomTeamListNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { AvatarTeamOuterClass.getDescriptor() });
        internal_static_CustomTeamListNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_CustomTeamListNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(CustomTeamListNotifyOuterClass.internal_static_CustomTeamListNotify_descriptor, new String[] { "TempAvatarGuidList", "AvatarTeamMap", "CustomTeamIds" });
        internal_static_CustomTeamListNotify_AvatarTeamMapEntry_descriptor = CustomTeamListNotifyOuterClass.internal_static_CustomTeamListNotify_descriptor.getNestedTypes().get(0);
        internal_static_CustomTeamListNotify_AvatarTeamMapEntry_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(CustomTeamListNotifyOuterClass.internal_static_CustomTeamListNotify_AvatarTeamMapEntry_descriptor, new String[] { "Key", "Value" });
        AvatarTeamOuterClass.getDescriptor();
    }
    
    public static final class CustomTeamListNotify extends GeneratedMessageV3 implements CustomTeamListNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int TEMP_AVATAR_GUID_LIST_FIELD_NUMBER = 6;
        private Internal.LongList tempAvatarGuidList_;
        private int tempAvatarGuidListMemoizedSerializedSize;
        public static final int AVATAR_TEAM_MAP_FIELD_NUMBER = 3;
        private MapField<Integer, AvatarTeamOuterClass.AvatarTeam> avatarTeamMap_;
        public static final int CUSTOM_TEAM_IDS_FIELD_NUMBER = 1;
        private Internal.IntList customTeamIds_;
        private int customTeamIdsMemoizedSerializedSize;
        private byte memoizedIsInitialized;
        private static final CustomTeamListNotify DEFAULT_INSTANCE;
        private static final Parser<CustomTeamListNotify> PARSER;
        
        private CustomTeamListNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.tempAvatarGuidListMemoizedSerializedSize = -1;
            this.customTeamIdsMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private CustomTeamListNotify() {
            this.tempAvatarGuidListMemoizedSerializedSize = -1;
            this.customTeamIdsMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.tempAvatarGuidList_ = GeneratedMessageV3.emptyLongList();
            this.customTeamIds_ = GeneratedMessageV3.emptyIntList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new CustomTeamListNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private CustomTeamListNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            if ((mutable_bitField0_ & 0x4) == 0x0) {
                                this.customTeamIds_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x4;
                            }
                            this.customTeamIds_.addInt(input.readUInt32());
                            continue;
                        }
                        case 10: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x4) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.customTeamIds_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x4;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.customTeamIds_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 26: {
                            if ((mutable_bitField0_ & 0x2) == 0x0) {
                                this.avatarTeamMap_ = MapField.newMapField(AvatarTeamMapDefaultEntryHolder.defaultEntry);
                                mutable_bitField0_ |= 0x2;
                            }
                            final MapEntry<Integer, AvatarTeamOuterClass.AvatarTeam> avatarTeamMap__ = input.readMessage(AvatarTeamMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                            this.avatarTeamMap_.getMutableMap().put(avatarTeamMap__.getKey(), avatarTeamMap__.getValue());
                            continue;
                        }
                        case 48: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.tempAvatarGuidList_ = GeneratedMessageV3.newLongList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.tempAvatarGuidList_.addLong(input.readUInt64());
                            continue;
                        }
                        case 50: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.tempAvatarGuidList_ = GeneratedMessageV3.newLongList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.tempAvatarGuidList_.addLong(input.readUInt64());
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
                    this.customTeamIds_.makeImmutable();
                }
                if ((mutable_bitField0_ & 0x1) != 0x0) {
                    this.tempAvatarGuidList_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return CustomTeamListNotifyOuterClass.internal_static_CustomTeamListNotify_descriptor;
        }
        
        @Override
        protected MapField internalGetMapField(final int number) {
            switch (number) {
                case 3: {
                    return this.internalGetAvatarTeamMap();
                }
                default: {
                    throw new RuntimeException("Invalid map field number: " + number);
                }
            }
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return CustomTeamListNotifyOuterClass.internal_static_CustomTeamListNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(CustomTeamListNotify.class, Builder.class);
        }
        
        @Override
        public List<Long> getTempAvatarGuidListList() {
            return this.tempAvatarGuidList_;
        }
        
        @Override
        public int getTempAvatarGuidListCount() {
            return this.tempAvatarGuidList_.size();
        }
        
        @Override
        public long getTempAvatarGuidList(final int index) {
            return this.tempAvatarGuidList_.getLong(index);
        }
        
        private MapField<Integer, AvatarTeamOuterClass.AvatarTeam> internalGetAvatarTeamMap() {
            if (this.avatarTeamMap_ == null) {
                return MapField.emptyMapField(AvatarTeamMapDefaultEntryHolder.defaultEntry);
            }
            return this.avatarTeamMap_;
        }
        
        @Override
        public int getAvatarTeamMapCount() {
            return this.internalGetAvatarTeamMap().getMap().size();
        }
        
        @Override
        public boolean containsAvatarTeamMap(final int key) {
            return this.internalGetAvatarTeamMap().getMap().containsKey(key);
        }
        
        @Deprecated
        @Override
        public Map<Integer, AvatarTeamOuterClass.AvatarTeam> getAvatarTeamMap() {
            return this.getAvatarTeamMapMap();
        }
        
        @Override
        public Map<Integer, AvatarTeamOuterClass.AvatarTeam> getAvatarTeamMapMap() {
            return this.internalGetAvatarTeamMap().getMap();
        }
        
        @Override
        public AvatarTeamOuterClass.AvatarTeam getAvatarTeamMapOrDefault(final int key, final AvatarTeamOuterClass.AvatarTeam defaultValue) {
            final Map<Integer, AvatarTeamOuterClass.AvatarTeam> map = this.internalGetAvatarTeamMap().getMap();
            return map.containsKey(key) ? map.get(key) : defaultValue;
        }
        
        @Override
        public AvatarTeamOuterClass.AvatarTeam getAvatarTeamMapOrThrow(final int key) {
            final Map<Integer, AvatarTeamOuterClass.AvatarTeam> map = this.internalGetAvatarTeamMap().getMap();
            if (!map.containsKey(key)) {
                throw new IllegalArgumentException();
            }
            return map.get(key);
        }
        
        @Override
        public List<Integer> getCustomTeamIdsList() {
            return this.customTeamIds_;
        }
        
        @Override
        public int getCustomTeamIdsCount() {
            return this.customTeamIds_.size();
        }
        
        @Override
        public int getCustomTeamIds(final int index) {
            return this.customTeamIds_.getInt(index);
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
            if (this.getCustomTeamIdsList().size() > 0) {
                output.writeUInt32NoTag(10);
                output.writeUInt32NoTag(this.customTeamIdsMemoizedSerializedSize);
            }
            for (int i = 0; i < this.customTeamIds_.size(); ++i) {
                output.writeUInt32NoTag(this.customTeamIds_.getInt(i));
            }
            GeneratedMessageV3.serializeIntegerMapTo(output, this.internalGetAvatarTeamMap(), AvatarTeamMapDefaultEntryHolder.defaultEntry, 3);
            if (this.getTempAvatarGuidListList().size() > 0) {
                output.writeUInt32NoTag(50);
                output.writeUInt32NoTag(this.tempAvatarGuidListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.tempAvatarGuidList_.size(); ++i) {
                output.writeUInt64NoTag(this.tempAvatarGuidList_.getLong(i));
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
            int dataSize = 0;
            for (int i = 0; i < this.customTeamIds_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.customTeamIds_.getInt(i));
            }
            size += dataSize;
            if (!this.getCustomTeamIdsList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.customTeamIdsMemoizedSerializedSize = dataSize;
            for (final Map.Entry<Integer, AvatarTeamOuterClass.AvatarTeam> entry : this.internalGetAvatarTeamMap().getMap().entrySet()) {
                final MapEntry<Integer, AvatarTeamOuterClass.AvatarTeam> avatarTeamMap__ = AvatarTeamMapDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).build();
                size += CodedOutputStream.computeMessageSize(3, avatarTeamMap__);
            }
            dataSize = 0;
            for (int i = 0; i < this.tempAvatarGuidList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt64SizeNoTag(this.tempAvatarGuidList_.getLong(i));
            }
            size += dataSize;
            if (!this.getTempAvatarGuidListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.tempAvatarGuidListMemoizedSerializedSize = dataSize;
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CustomTeamListNotify)) {
                return super.equals(obj);
            }
            final CustomTeamListNotify other = (CustomTeamListNotify)obj;
            return this.getTempAvatarGuidListList().equals(other.getTempAvatarGuidListList()) && this.internalGetAvatarTeamMap().equals(other.internalGetAvatarTeamMap()) && this.getCustomTeamIdsList().equals(other.getCustomTeamIdsList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getTempAvatarGuidListCount() > 0) {
                hash = 37 * hash + 6;
                hash = 53 * hash + this.getTempAvatarGuidListList().hashCode();
            }
            if (!this.internalGetAvatarTeamMap().getMap().isEmpty()) {
                hash = 37 * hash + 3;
                hash = 53 * hash + this.internalGetAvatarTeamMap().hashCode();
            }
            if (this.getCustomTeamIdsCount() > 0) {
                hash = 37 * hash + 1;
                hash = 53 * hash + this.getCustomTeamIdsList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static CustomTeamListNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return CustomTeamListNotify.PARSER.parseFrom(data);
        }
        
        public static CustomTeamListNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CustomTeamListNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CustomTeamListNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return CustomTeamListNotify.PARSER.parseFrom(data);
        }
        
        public static CustomTeamListNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CustomTeamListNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CustomTeamListNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return CustomTeamListNotify.PARSER.parseFrom(data);
        }
        
        public static CustomTeamListNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CustomTeamListNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CustomTeamListNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CustomTeamListNotify.PARSER, input);
        }
        
        public static CustomTeamListNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CustomTeamListNotify.PARSER, input, extensionRegistry);
        }
        
        public static CustomTeamListNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(CustomTeamListNotify.PARSER, input);
        }
        
        public static CustomTeamListNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(CustomTeamListNotify.PARSER, input, extensionRegistry);
        }
        
        public static CustomTeamListNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CustomTeamListNotify.PARSER, input);
        }
        
        public static CustomTeamListNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CustomTeamListNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return CustomTeamListNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final CustomTeamListNotify prototype) {
            return CustomTeamListNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == CustomTeamListNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static CustomTeamListNotify getDefaultInstance() {
            return CustomTeamListNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<CustomTeamListNotify> parser() {
            return CustomTeamListNotify.PARSER;
        }
        
        @Override
        public Parser<CustomTeamListNotify> getParserForType() {
            return CustomTeamListNotify.PARSER;
        }
        
        @Override
        public CustomTeamListNotify getDefaultInstanceForType() {
            return CustomTeamListNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new CustomTeamListNotify();
            PARSER = new AbstractParser<CustomTeamListNotify>() {
                @Override
                public CustomTeamListNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new CustomTeamListNotify(input, extensionRegistry);
                }
            };
        }
        
        private static final class AvatarTeamMapDefaultEntryHolder
        {
            static final MapEntry<Integer, AvatarTeamOuterClass.AvatarTeam> defaultEntry;
            
            static {
                defaultEntry = MapEntry.newDefaultInstance(CustomTeamListNotifyOuterClass.internal_static_CustomTeamListNotify_AvatarTeamMapEntry_descriptor, WireFormat.FieldType.UINT32, 0, WireFormat.FieldType.MESSAGE, AvatarTeamOuterClass.AvatarTeam.getDefaultInstance());
            }
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CustomTeamListNotifyOrBuilder
        {
            private int bitField0_;
            private Internal.LongList tempAvatarGuidList_;
            private MapField<Integer, AvatarTeamOuterClass.AvatarTeam> avatarTeamMap_;
            private Internal.IntList customTeamIds_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return CustomTeamListNotifyOuterClass.internal_static_CustomTeamListNotify_descriptor;
            }
            
            @Override
            protected MapField internalGetMapField(final int number) {
                switch (number) {
                    case 3: {
                        return this.internalGetAvatarTeamMap();
                    }
                    default: {
                        throw new RuntimeException("Invalid map field number: " + number);
                    }
                }
            }
            
            @Override
            protected MapField internalGetMutableMapField(final int number) {
                switch (number) {
                    case 3: {
                        return this.internalGetMutableAvatarTeamMap();
                    }
                    default: {
                        throw new RuntimeException("Invalid map field number: " + number);
                    }
                }
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return CustomTeamListNotifyOuterClass.internal_static_CustomTeamListNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(CustomTeamListNotify.class, Builder.class);
            }
            
            private Builder() {
                this.tempAvatarGuidList_ = GeneratedMessageV3.emptyLongList();
                this.customTeamIds_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.tempAvatarGuidList_ = GeneratedMessageV3.emptyLongList();
                this.customTeamIds_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (CustomTeamListNotify.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.tempAvatarGuidList_ = GeneratedMessageV3.emptyLongList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.internalGetMutableAvatarTeamMap().clear();
                this.customTeamIds_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFB;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return CustomTeamListNotifyOuterClass.internal_static_CustomTeamListNotify_descriptor;
            }
            
            @Override
            public CustomTeamListNotify getDefaultInstanceForType() {
                return CustomTeamListNotify.getDefaultInstance();
            }
            
            @Override
            public CustomTeamListNotify build() {
                final CustomTeamListNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public CustomTeamListNotify buildPartial() {
                final CustomTeamListNotify result = new CustomTeamListNotify(this);
                final int from_bitField0_ = this.bitField0_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.tempAvatarGuidList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.tempAvatarGuidList_ = this.tempAvatarGuidList_;
                (result.avatarTeamMap_ = this.internalGetAvatarTeamMap()).makeImmutable();
                if ((this.bitField0_ & 0x4) != 0x0) {
                    this.customTeamIds_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFB;
                }
                result.customTeamIds_ = this.customTeamIds_;
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
                if (other instanceof CustomTeamListNotify) {
                    return this.mergeFrom((CustomTeamListNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final CustomTeamListNotify other) {
                if (other == CustomTeamListNotify.getDefaultInstance()) {
                    return this;
                }
                if (!other.tempAvatarGuidList_.isEmpty()) {
                    if (this.tempAvatarGuidList_.isEmpty()) {
                        this.tempAvatarGuidList_ = other.tempAvatarGuidList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureTempAvatarGuidListIsMutable();
                        this.tempAvatarGuidList_.addAll(other.tempAvatarGuidList_);
                    }
                    this.onChanged();
                }
                this.internalGetMutableAvatarTeamMap().mergeFrom(other.internalGetAvatarTeamMap());
                if (!other.customTeamIds_.isEmpty()) {
                    if (this.customTeamIds_.isEmpty()) {
                        this.customTeamIds_ = other.customTeamIds_;
                        this.bitField0_ &= 0xFFFFFFFB;
                    }
                    else {
                        this.ensureCustomTeamIdsIsMutable();
                        this.customTeamIds_.addAll(other.customTeamIds_);
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
                CustomTeamListNotify parsedMessage = null;
                try {
                    parsedMessage = CustomTeamListNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (CustomTeamListNotify)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureTempAvatarGuidListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.tempAvatarGuidList_ = GeneratedMessageV3.mutableCopy(this.tempAvatarGuidList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Long> getTempAvatarGuidListList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Long>)this.tempAvatarGuidList_) : this.tempAvatarGuidList_;
            }
            
            @Override
            public int getTempAvatarGuidListCount() {
                return this.tempAvatarGuidList_.size();
            }
            
            @Override
            public long getTempAvatarGuidList(final int index) {
                return this.tempAvatarGuidList_.getLong(index);
            }
            
            public Builder setTempAvatarGuidList(final int index, final long value) {
                this.ensureTempAvatarGuidListIsMutable();
                this.tempAvatarGuidList_.setLong(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addTempAvatarGuidList(final long value) {
                this.ensureTempAvatarGuidListIsMutable();
                this.tempAvatarGuidList_.addLong(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllTempAvatarGuidList(final Iterable<? extends Long> values) {
                this.ensureTempAvatarGuidListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.tempAvatarGuidList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearTempAvatarGuidList() {
                this.tempAvatarGuidList_ = GeneratedMessageV3.emptyLongList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.onChanged();
                return this;
            }
            
            private MapField<Integer, AvatarTeamOuterClass.AvatarTeam> internalGetAvatarTeamMap() {
                if (this.avatarTeamMap_ == null) {
                    return MapField.emptyMapField(AvatarTeamMapDefaultEntryHolder.defaultEntry);
                }
                return this.avatarTeamMap_;
            }
            
            private MapField<Integer, AvatarTeamOuterClass.AvatarTeam> internalGetMutableAvatarTeamMap() {
                this.onChanged();
                if (this.avatarTeamMap_ == null) {
                    this.avatarTeamMap_ = MapField.newMapField(AvatarTeamMapDefaultEntryHolder.defaultEntry);
                }
                if (!this.avatarTeamMap_.isMutable()) {
                    this.avatarTeamMap_ = this.avatarTeamMap_.copy();
                }
                return this.avatarTeamMap_;
            }
            
            @Override
            public int getAvatarTeamMapCount() {
                return this.internalGetAvatarTeamMap().getMap().size();
            }
            
            @Override
            public boolean containsAvatarTeamMap(final int key) {
                return this.internalGetAvatarTeamMap().getMap().containsKey(key);
            }
            
            @Deprecated
            @Override
            public Map<Integer, AvatarTeamOuterClass.AvatarTeam> getAvatarTeamMap() {
                return this.getAvatarTeamMapMap();
            }
            
            @Override
            public Map<Integer, AvatarTeamOuterClass.AvatarTeam> getAvatarTeamMapMap() {
                return this.internalGetAvatarTeamMap().getMap();
            }
            
            @Override
            public AvatarTeamOuterClass.AvatarTeam getAvatarTeamMapOrDefault(final int key, final AvatarTeamOuterClass.AvatarTeam defaultValue) {
                final Map<Integer, AvatarTeamOuterClass.AvatarTeam> map = this.internalGetAvatarTeamMap().getMap();
                return map.containsKey(key) ? map.get(key) : defaultValue;
            }
            
            @Override
            public AvatarTeamOuterClass.AvatarTeam getAvatarTeamMapOrThrow(final int key) {
                final Map<Integer, AvatarTeamOuterClass.AvatarTeam> map = this.internalGetAvatarTeamMap().getMap();
                if (!map.containsKey(key)) {
                    throw new IllegalArgumentException();
                }
                return map.get(key);
            }
            
            public Builder clearAvatarTeamMap() {
                this.internalGetMutableAvatarTeamMap().getMutableMap().clear();
                return this;
            }
            
            public Builder removeAvatarTeamMap(final int key) {
                this.internalGetMutableAvatarTeamMap().getMutableMap().remove(key);
                return this;
            }
            
            @Deprecated
            public Map<Integer, AvatarTeamOuterClass.AvatarTeam> getMutableAvatarTeamMap() {
                return this.internalGetMutableAvatarTeamMap().getMutableMap();
            }
            
            public Builder putAvatarTeamMap(final int key, final AvatarTeamOuterClass.AvatarTeam value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.internalGetMutableAvatarTeamMap().getMutableMap().put(key, value);
                return this;
            }
            
            public Builder putAllAvatarTeamMap(final Map<Integer, AvatarTeamOuterClass.AvatarTeam> values) {
                this.internalGetMutableAvatarTeamMap().getMutableMap().putAll(values);
                return this;
            }
            
            private void ensureCustomTeamIdsIsMutable() {
                if ((this.bitField0_ & 0x4) == 0x0) {
                    this.customTeamIds_ = GeneratedMessageV3.mutableCopy(this.customTeamIds_);
                    this.bitField0_ |= 0x4;
                }
            }
            
            @Override
            public List<Integer> getCustomTeamIdsList() {
                return ((this.bitField0_ & 0x4) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.customTeamIds_) : this.customTeamIds_;
            }
            
            @Override
            public int getCustomTeamIdsCount() {
                return this.customTeamIds_.size();
            }
            
            @Override
            public int getCustomTeamIds(final int index) {
                return this.customTeamIds_.getInt(index);
            }
            
            public Builder setCustomTeamIds(final int index, final int value) {
                this.ensureCustomTeamIdsIsMutable();
                this.customTeamIds_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addCustomTeamIds(final int value) {
                this.ensureCustomTeamIdsIsMutable();
                this.customTeamIds_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllCustomTeamIds(final Iterable<? extends Integer> values) {
                this.ensureCustomTeamIdsIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.customTeamIds_);
                this.onChanged();
                return this;
            }
            
            public Builder clearCustomTeamIds() {
                this.customTeamIds_ = GeneratedMessageV3.emptyIntList();
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
    
    public interface CustomTeamListNotifyOrBuilder extends MessageOrBuilder
    {
        List<Long> getTempAvatarGuidListList();
        
        int getTempAvatarGuidListCount();
        
        long getTempAvatarGuidList(final int p0);
        
        int getAvatarTeamMapCount();
        
        boolean containsAvatarTeamMap(final int p0);
        
        @Deprecated
        Map<Integer, AvatarTeamOuterClass.AvatarTeam> getAvatarTeamMap();
        
        Map<Integer, AvatarTeamOuterClass.AvatarTeam> getAvatarTeamMapMap();
        
        AvatarTeamOuterClass.AvatarTeam getAvatarTeamMapOrDefault(final int p0, final AvatarTeamOuterClass.AvatarTeam p1);
        
        AvatarTeamOuterClass.AvatarTeam getAvatarTeamMapOrThrow(final int p0);
        
        List<Integer> getCustomTeamIdsList();
        
        int getCustomTeamIdsCount();
        
        int getCustomTeamIds(final int p0);
    }
}
