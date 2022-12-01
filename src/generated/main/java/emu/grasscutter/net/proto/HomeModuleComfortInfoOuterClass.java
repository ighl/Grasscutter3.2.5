// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import java.util.Collections;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream;
import java.util.List;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Parser;
import com.google.protobuf.Internal;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class HomeModuleComfortInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_HomeModuleComfortInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_HomeModuleComfortInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private HomeModuleComfortInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return HomeModuleComfortInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001bHomeModuleComfortInfo.proto\"z\n\u0015HomeModuleComfortInfo\u0012\u0011\n\tmodule_id\u0018\r \u0001(\r\u0012 \n\u0018room_scene_comfort_value\u0018\t \u0001(\r\u0012,\n$world_scene_block_comfort_value_list\u0018\u0003 \u0003(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        HomeModuleComfortInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_HomeModuleComfortInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_HomeModuleComfortInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(HomeModuleComfortInfoOuterClass.internal_static_HomeModuleComfortInfo_descriptor, new String[] { "ModuleId", "RoomSceneComfortValue", "WorldSceneBlockComfortValueList" });
    }
    
    public static final class HomeModuleComfortInfo extends GeneratedMessageV3 implements HomeModuleComfortInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int MODULE_ID_FIELD_NUMBER = 13;
        private int moduleId_;
        public static final int ROOM_SCENE_COMFORT_VALUE_FIELD_NUMBER = 9;
        private int roomSceneComfortValue_;
        public static final int WORLD_SCENE_BLOCK_COMFORT_VALUE_LIST_FIELD_NUMBER = 3;
        private Internal.IntList worldSceneBlockComfortValueList_;
        private int worldSceneBlockComfortValueListMemoizedSerializedSize;
        private byte memoizedIsInitialized;
        private static final HomeModuleComfortInfo DEFAULT_INSTANCE;
        private static final Parser<HomeModuleComfortInfo> PARSER;
        
        private HomeModuleComfortInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.worldSceneBlockComfortValueListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private HomeModuleComfortInfo() {
            this.worldSceneBlockComfortValueListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.worldSceneBlockComfortValueList_ = GeneratedMessageV3.emptyIntList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new HomeModuleComfortInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private HomeModuleComfortInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 24: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.worldSceneBlockComfortValueList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.worldSceneBlockComfortValueList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 26: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.worldSceneBlockComfortValueList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.worldSceneBlockComfortValueList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 72: {
                            this.roomSceneComfortValue_ = input.readUInt32();
                            continue;
                        }
                        case 104: {
                            this.moduleId_ = input.readUInt32();
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
                if ((mutable_bitField0_ & 0x1) != 0x0) {
                    this.worldSceneBlockComfortValueList_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return HomeModuleComfortInfoOuterClass.internal_static_HomeModuleComfortInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return HomeModuleComfortInfoOuterClass.internal_static_HomeModuleComfortInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(HomeModuleComfortInfo.class, Builder.class);
        }
        
        @Override
        public int getModuleId() {
            return this.moduleId_;
        }
        
        @Override
        public int getRoomSceneComfortValue() {
            return this.roomSceneComfortValue_;
        }
        
        @Override
        public List<Integer> getWorldSceneBlockComfortValueListList() {
            return this.worldSceneBlockComfortValueList_;
        }
        
        @Override
        public int getWorldSceneBlockComfortValueListCount() {
            return this.worldSceneBlockComfortValueList_.size();
        }
        
        @Override
        public int getWorldSceneBlockComfortValueList(final int index) {
            return this.worldSceneBlockComfortValueList_.getInt(index);
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
            if (this.getWorldSceneBlockComfortValueListList().size() > 0) {
                output.writeUInt32NoTag(26);
                output.writeUInt32NoTag(this.worldSceneBlockComfortValueListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.worldSceneBlockComfortValueList_.size(); ++i) {
                output.writeUInt32NoTag(this.worldSceneBlockComfortValueList_.getInt(i));
            }
            if (this.roomSceneComfortValue_ != 0) {
                output.writeUInt32(9, this.roomSceneComfortValue_);
            }
            if (this.moduleId_ != 0) {
                output.writeUInt32(13, this.moduleId_);
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
            for (int i = 0; i < this.worldSceneBlockComfortValueList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.worldSceneBlockComfortValueList_.getInt(i));
            }
            size += dataSize;
            if (!this.getWorldSceneBlockComfortValueListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.worldSceneBlockComfortValueListMemoizedSerializedSize = dataSize;
            if (this.roomSceneComfortValue_ != 0) {
                size += CodedOutputStream.computeUInt32Size(9, this.roomSceneComfortValue_);
            }
            if (this.moduleId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(13, this.moduleId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof HomeModuleComfortInfo)) {
                return super.equals(obj);
            }
            final HomeModuleComfortInfo other = (HomeModuleComfortInfo)obj;
            return this.getModuleId() == other.getModuleId() && this.getRoomSceneComfortValue() == other.getRoomSceneComfortValue() && this.getWorldSceneBlockComfortValueListList().equals(other.getWorldSceneBlockComfortValueListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 13;
            hash = 53 * hash + this.getModuleId();
            hash = 37 * hash + 9;
            hash = 53 * hash + this.getRoomSceneComfortValue();
            if (this.getWorldSceneBlockComfortValueListCount() > 0) {
                hash = 37 * hash + 3;
                hash = 53 * hash + this.getWorldSceneBlockComfortValueListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static HomeModuleComfortInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return HomeModuleComfortInfo.PARSER.parseFrom(data);
        }
        
        public static HomeModuleComfortInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HomeModuleComfortInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HomeModuleComfortInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return HomeModuleComfortInfo.PARSER.parseFrom(data);
        }
        
        public static HomeModuleComfortInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HomeModuleComfortInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HomeModuleComfortInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return HomeModuleComfortInfo.PARSER.parseFrom(data);
        }
        
        public static HomeModuleComfortInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HomeModuleComfortInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HomeModuleComfortInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeModuleComfortInfo.PARSER, input);
        }
        
        public static HomeModuleComfortInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeModuleComfortInfo.PARSER, input, extensionRegistry);
        }
        
        public static HomeModuleComfortInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(HomeModuleComfortInfo.PARSER, input);
        }
        
        public static HomeModuleComfortInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(HomeModuleComfortInfo.PARSER, input, extensionRegistry);
        }
        
        public static HomeModuleComfortInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeModuleComfortInfo.PARSER, input);
        }
        
        public static HomeModuleComfortInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeModuleComfortInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return HomeModuleComfortInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final HomeModuleComfortInfo prototype) {
            return HomeModuleComfortInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == HomeModuleComfortInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static HomeModuleComfortInfo getDefaultInstance() {
            return HomeModuleComfortInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<HomeModuleComfortInfo> parser() {
            return HomeModuleComfortInfo.PARSER;
        }
        
        @Override
        public Parser<HomeModuleComfortInfo> getParserForType() {
            return HomeModuleComfortInfo.PARSER;
        }
        
        @Override
        public HomeModuleComfortInfo getDefaultInstanceForType() {
            return HomeModuleComfortInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new HomeModuleComfortInfo();
            PARSER = new AbstractParser<HomeModuleComfortInfo>() {
                @Override
                public HomeModuleComfortInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new HomeModuleComfortInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements HomeModuleComfortInfoOrBuilder
        {
            private int bitField0_;
            private int moduleId_;
            private int roomSceneComfortValue_;
            private Internal.IntList worldSceneBlockComfortValueList_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return HomeModuleComfortInfoOuterClass.internal_static_HomeModuleComfortInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return HomeModuleComfortInfoOuterClass.internal_static_HomeModuleComfortInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(HomeModuleComfortInfo.class, Builder.class);
            }
            
            private Builder() {
                this.worldSceneBlockComfortValueList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.worldSceneBlockComfortValueList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (HomeModuleComfortInfo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.moduleId_ = 0;
                this.roomSceneComfortValue_ = 0;
                this.worldSceneBlockComfortValueList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return HomeModuleComfortInfoOuterClass.internal_static_HomeModuleComfortInfo_descriptor;
            }
            
            @Override
            public HomeModuleComfortInfo getDefaultInstanceForType() {
                return HomeModuleComfortInfo.getDefaultInstance();
            }
            
            @Override
            public HomeModuleComfortInfo build() {
                final HomeModuleComfortInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public HomeModuleComfortInfo buildPartial() {
                final HomeModuleComfortInfo result = new HomeModuleComfortInfo(this);
                final int from_bitField0_ = this.bitField0_;
                result.moduleId_ = this.moduleId_;
                result.roomSceneComfortValue_ = this.roomSceneComfortValue_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.worldSceneBlockComfortValueList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.worldSceneBlockComfortValueList_ = this.worldSceneBlockComfortValueList_;
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
                if (other instanceof HomeModuleComfortInfo) {
                    return this.mergeFrom((HomeModuleComfortInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final HomeModuleComfortInfo other) {
                if (other == HomeModuleComfortInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.getModuleId() != 0) {
                    this.setModuleId(other.getModuleId());
                }
                if (other.getRoomSceneComfortValue() != 0) {
                    this.setRoomSceneComfortValue(other.getRoomSceneComfortValue());
                }
                if (!other.worldSceneBlockComfortValueList_.isEmpty()) {
                    if (this.worldSceneBlockComfortValueList_.isEmpty()) {
                        this.worldSceneBlockComfortValueList_ = other.worldSceneBlockComfortValueList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureWorldSceneBlockComfortValueListIsMutable();
                        this.worldSceneBlockComfortValueList_.addAll(other.worldSceneBlockComfortValueList_);
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
                HomeModuleComfortInfo parsedMessage = null;
                try {
                    parsedMessage = HomeModuleComfortInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (HomeModuleComfortInfo)e.getUnfinishedMessage();
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
            public int getModuleId() {
                return this.moduleId_;
            }
            
            public Builder setModuleId(final int value) {
                this.moduleId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearModuleId() {
                this.moduleId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getRoomSceneComfortValue() {
                return this.roomSceneComfortValue_;
            }
            
            public Builder setRoomSceneComfortValue(final int value) {
                this.roomSceneComfortValue_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearRoomSceneComfortValue() {
                this.roomSceneComfortValue_ = 0;
                this.onChanged();
                return this;
            }
            
            private void ensureWorldSceneBlockComfortValueListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.worldSceneBlockComfortValueList_ = GeneratedMessageV3.mutableCopy(this.worldSceneBlockComfortValueList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Integer> getWorldSceneBlockComfortValueListList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.worldSceneBlockComfortValueList_) : this.worldSceneBlockComfortValueList_;
            }
            
            @Override
            public int getWorldSceneBlockComfortValueListCount() {
                return this.worldSceneBlockComfortValueList_.size();
            }
            
            @Override
            public int getWorldSceneBlockComfortValueList(final int index) {
                return this.worldSceneBlockComfortValueList_.getInt(index);
            }
            
            public Builder setWorldSceneBlockComfortValueList(final int index, final int value) {
                this.ensureWorldSceneBlockComfortValueListIsMutable();
                this.worldSceneBlockComfortValueList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addWorldSceneBlockComfortValueList(final int value) {
                this.ensureWorldSceneBlockComfortValueListIsMutable();
                this.worldSceneBlockComfortValueList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllWorldSceneBlockComfortValueList(final Iterable<? extends Integer> values) {
                this.ensureWorldSceneBlockComfortValueListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.worldSceneBlockComfortValueList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearWorldSceneBlockComfortValueList() {
                this.worldSceneBlockComfortValueList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
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
    
    public interface HomeModuleComfortInfoOrBuilder extends MessageOrBuilder
    {
        int getModuleId();
        
        int getRoomSceneComfortValue();
        
        List<Integer> getWorldSceneBlockComfortValueListList();
        
        int getWorldSceneBlockComfortValueListCount();
        
        int getWorldSceneBlockComfortValueList(final int p0);
    }
}
