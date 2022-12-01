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

public final class MassivePropParamOuterClass
{
    private static final Descriptors.Descriptor internal_static_MassivePropParam_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_MassivePropParam_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private MassivePropParamOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return MassivePropParamOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0016MassivePropParam.proto\"c\n\u0010MassivePropParam\u0012\f\n\u0004type\u0018\u0001 \u0001(\u0005\u0012\u001a\n\u0012reaction_info_list\u0018\u0002 \u0003(\r\u0012\u0012\n\nparam_list\u0018\u0003 \u0003(\u0002\u0012\u0011\n\tsync_flag\u0018\u0004 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        MassivePropParamOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_MassivePropParam_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_MassivePropParam_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(MassivePropParamOuterClass.internal_static_MassivePropParam_descriptor, new String[] { "Type", "ReactionInfoList", "ParamList", "SyncFlag" });
    }
    
    public static final class MassivePropParam extends GeneratedMessageV3 implements MassivePropParamOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int TYPE_FIELD_NUMBER = 1;
        private int type_;
        public static final int REACTION_INFO_LIST_FIELD_NUMBER = 2;
        private Internal.IntList reactionInfoList_;
        private int reactionInfoListMemoizedSerializedSize;
        public static final int PARAM_LIST_FIELD_NUMBER = 3;
        private Internal.FloatList paramList_;
        private int paramListMemoizedSerializedSize;
        public static final int SYNC_FLAG_FIELD_NUMBER = 4;
        private int syncFlag_;
        private byte memoizedIsInitialized;
        private static final MassivePropParam DEFAULT_INSTANCE;
        private static final Parser<MassivePropParam> PARSER;
        
        private MassivePropParam(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.reactionInfoListMemoizedSerializedSize = -1;
            this.paramListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private MassivePropParam() {
            this.reactionInfoListMemoizedSerializedSize = -1;
            this.paramListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.reactionInfoList_ = GeneratedMessageV3.emptyIntList();
            this.paramList_ = GeneratedMessageV3.emptyFloatList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new MassivePropParam();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private MassivePropParam(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.type_ = input.readInt32();
                            continue;
                        }
                        case 16: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.reactionInfoList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.reactionInfoList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 18: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.reactionInfoList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.reactionInfoList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 29: {
                            if ((mutable_bitField0_ & 0x2) == 0x0) {
                                this.paramList_ = GeneratedMessageV3.newFloatList();
                                mutable_bitField0_ |= 0x2;
                            }
                            this.paramList_.addFloat(input.readFloat());
                            continue;
                        }
                        case 26: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x2) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.paramList_ = GeneratedMessageV3.newFloatList();
                                mutable_bitField0_ |= 0x2;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.paramList_.addFloat(input.readFloat());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 32: {
                            this.syncFlag_ = input.readUInt32();
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
                    this.reactionInfoList_.makeImmutable();
                }
                if ((mutable_bitField0_ & 0x2) != 0x0) {
                    this.paramList_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return MassivePropParamOuterClass.internal_static_MassivePropParam_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return MassivePropParamOuterClass.internal_static_MassivePropParam_fieldAccessorTable.ensureFieldAccessorsInitialized(MassivePropParam.class, Builder.class);
        }
        
        @Override
        public int getType() {
            return this.type_;
        }
        
        @Override
        public List<Integer> getReactionInfoListList() {
            return this.reactionInfoList_;
        }
        
        @Override
        public int getReactionInfoListCount() {
            return this.reactionInfoList_.size();
        }
        
        @Override
        public int getReactionInfoList(final int index) {
            return this.reactionInfoList_.getInt(index);
        }
        
        @Override
        public List<Float> getParamListList() {
            return this.paramList_;
        }
        
        @Override
        public int getParamListCount() {
            return this.paramList_.size();
        }
        
        @Override
        public float getParamList(final int index) {
            return this.paramList_.getFloat(index);
        }
        
        @Override
        public int getSyncFlag() {
            return this.syncFlag_;
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
            if (this.type_ != 0) {
                output.writeInt32(1, this.type_);
            }
            if (this.getReactionInfoListList().size() > 0) {
                output.writeUInt32NoTag(18);
                output.writeUInt32NoTag(this.reactionInfoListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.reactionInfoList_.size(); ++i) {
                output.writeUInt32NoTag(this.reactionInfoList_.getInt(i));
            }
            if (this.getParamListList().size() > 0) {
                output.writeUInt32NoTag(26);
                output.writeUInt32NoTag(this.paramListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.paramList_.size(); ++i) {
                output.writeFloatNoTag(this.paramList_.getFloat(i));
            }
            if (this.syncFlag_ != 0) {
                output.writeUInt32(4, this.syncFlag_);
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
            if (this.type_ != 0) {
                size += CodedOutputStream.computeInt32Size(1, this.type_);
            }
            int dataSize = 0;
            for (int i = 0; i < this.reactionInfoList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.reactionInfoList_.getInt(i));
            }
            size += dataSize;
            if (!this.getReactionInfoListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.reactionInfoListMemoizedSerializedSize = dataSize;
            dataSize = 0;
            dataSize = 4 * this.getParamListList().size();
            size += dataSize;
            if (!this.getParamListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.paramListMemoizedSerializedSize = dataSize;
            if (this.syncFlag_ != 0) {
                size += CodedOutputStream.computeUInt32Size(4, this.syncFlag_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MassivePropParam)) {
                return super.equals(obj);
            }
            final MassivePropParam other = (MassivePropParam)obj;
            return this.getType() == other.getType() && this.getReactionInfoListList().equals(other.getReactionInfoListList()) && this.getParamListList().equals(other.getParamListList()) && this.getSyncFlag() == other.getSyncFlag() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getType();
            if (this.getReactionInfoListCount() > 0) {
                hash = 37 * hash + 2;
                hash = 53 * hash + this.getReactionInfoListList().hashCode();
            }
            if (this.getParamListCount() > 0) {
                hash = 37 * hash + 3;
                hash = 53 * hash + this.getParamListList().hashCode();
            }
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getSyncFlag();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static MassivePropParam parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return MassivePropParam.PARSER.parseFrom(data);
        }
        
        public static MassivePropParam parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MassivePropParam.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MassivePropParam parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return MassivePropParam.PARSER.parseFrom(data);
        }
        
        public static MassivePropParam parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MassivePropParam.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MassivePropParam parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return MassivePropParam.PARSER.parseFrom(data);
        }
        
        public static MassivePropParam parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MassivePropParam.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MassivePropParam parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MassivePropParam.PARSER, input);
        }
        
        public static MassivePropParam parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MassivePropParam.PARSER, input, extensionRegistry);
        }
        
        public static MassivePropParam parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(MassivePropParam.PARSER, input);
        }
        
        public static MassivePropParam parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(MassivePropParam.PARSER, input, extensionRegistry);
        }
        
        public static MassivePropParam parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MassivePropParam.PARSER, input);
        }
        
        public static MassivePropParam parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MassivePropParam.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return MassivePropParam.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final MassivePropParam prototype) {
            return MassivePropParam.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == MassivePropParam.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static MassivePropParam getDefaultInstance() {
            return MassivePropParam.DEFAULT_INSTANCE;
        }
        
        public static Parser<MassivePropParam> parser() {
            return MassivePropParam.PARSER;
        }
        
        @Override
        public Parser<MassivePropParam> getParserForType() {
            return MassivePropParam.PARSER;
        }
        
        @Override
        public MassivePropParam getDefaultInstanceForType() {
            return MassivePropParam.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new MassivePropParam();
            PARSER = new AbstractParser<MassivePropParam>() {
                @Override
                public MassivePropParam parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new MassivePropParam(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MassivePropParamOrBuilder
        {
            private int bitField0_;
            private int type_;
            private Internal.IntList reactionInfoList_;
            private Internal.FloatList paramList_;
            private int syncFlag_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return MassivePropParamOuterClass.internal_static_MassivePropParam_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return MassivePropParamOuterClass.internal_static_MassivePropParam_fieldAccessorTable.ensureFieldAccessorsInitialized(MassivePropParam.class, Builder.class);
            }
            
            private Builder() {
                this.reactionInfoList_ = GeneratedMessageV3.emptyIntList();
                this.paramList_ = GeneratedMessageV3.emptyFloatList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.reactionInfoList_ = GeneratedMessageV3.emptyIntList();
                this.paramList_ = GeneratedMessageV3.emptyFloatList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (MassivePropParam.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.type_ = 0;
                this.reactionInfoList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.paramList_ = GeneratedMessageV3.emptyFloatList();
                this.bitField0_ &= 0xFFFFFFFD;
                this.syncFlag_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return MassivePropParamOuterClass.internal_static_MassivePropParam_descriptor;
            }
            
            @Override
            public MassivePropParam getDefaultInstanceForType() {
                return MassivePropParam.getDefaultInstance();
            }
            
            @Override
            public MassivePropParam build() {
                final MassivePropParam result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public MassivePropParam buildPartial() {
                final MassivePropParam result = new MassivePropParam(this);
                final int from_bitField0_ = this.bitField0_;
                result.type_ = this.type_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.reactionInfoList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.reactionInfoList_ = this.reactionInfoList_;
                if ((this.bitField0_ & 0x2) != 0x0) {
                    this.paramList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFD;
                }
                result.paramList_ = this.paramList_;
                result.syncFlag_ = this.syncFlag_;
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
                if (other instanceof MassivePropParam) {
                    return this.mergeFrom((MassivePropParam)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final MassivePropParam other) {
                if (other == MassivePropParam.getDefaultInstance()) {
                    return this;
                }
                if (other.getType() != 0) {
                    this.setType(other.getType());
                }
                if (!other.reactionInfoList_.isEmpty()) {
                    if (this.reactionInfoList_.isEmpty()) {
                        this.reactionInfoList_ = other.reactionInfoList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureReactionInfoListIsMutable();
                        this.reactionInfoList_.addAll(other.reactionInfoList_);
                    }
                    this.onChanged();
                }
                if (!other.paramList_.isEmpty()) {
                    if (this.paramList_.isEmpty()) {
                        this.paramList_ = other.paramList_;
                        this.bitField0_ &= 0xFFFFFFFD;
                    }
                    else {
                        this.ensureParamListIsMutable();
                        this.paramList_.addAll(other.paramList_);
                    }
                    this.onChanged();
                }
                if (other.getSyncFlag() != 0) {
                    this.setSyncFlag(other.getSyncFlag());
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
                MassivePropParam parsedMessage = null;
                try {
                    parsedMessage = MassivePropParam.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (MassivePropParam)e.getUnfinishedMessage();
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
            public int getType() {
                return this.type_;
            }
            
            public Builder setType(final int value) {
                this.type_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearType() {
                this.type_ = 0;
                this.onChanged();
                return this;
            }
            
            private void ensureReactionInfoListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.reactionInfoList_ = GeneratedMessageV3.mutableCopy(this.reactionInfoList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Integer> getReactionInfoListList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.reactionInfoList_) : this.reactionInfoList_;
            }
            
            @Override
            public int getReactionInfoListCount() {
                return this.reactionInfoList_.size();
            }
            
            @Override
            public int getReactionInfoList(final int index) {
                return this.reactionInfoList_.getInt(index);
            }
            
            public Builder setReactionInfoList(final int index, final int value) {
                this.ensureReactionInfoListIsMutable();
                this.reactionInfoList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addReactionInfoList(final int value) {
                this.ensureReactionInfoListIsMutable();
                this.reactionInfoList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllReactionInfoList(final Iterable<? extends Integer> values) {
                this.ensureReactionInfoListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.reactionInfoList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearReactionInfoList() {
                this.reactionInfoList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.onChanged();
                return this;
            }
            
            private void ensureParamListIsMutable() {
                if ((this.bitField0_ & 0x2) == 0x0) {
                    this.paramList_ = GeneratedMessageV3.mutableCopy(this.paramList_);
                    this.bitField0_ |= 0x2;
                }
            }
            
            @Override
            public List<Float> getParamListList() {
                return ((this.bitField0_ & 0x2) != 0x0) ? Collections.unmodifiableList((List<? extends Float>)this.paramList_) : this.paramList_;
            }
            
            @Override
            public int getParamListCount() {
                return this.paramList_.size();
            }
            
            @Override
            public float getParamList(final int index) {
                return this.paramList_.getFloat(index);
            }
            
            public Builder setParamList(final int index, final float value) {
                this.ensureParamListIsMutable();
                this.paramList_.setFloat(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addParamList(final float value) {
                this.ensureParamListIsMutable();
                this.paramList_.addFloat(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllParamList(final Iterable<? extends Float> values) {
                this.ensureParamListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.paramList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearParamList() {
                this.paramList_ = GeneratedMessageV3.emptyFloatList();
                this.bitField0_ &= 0xFFFFFFFD;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getSyncFlag() {
                return this.syncFlag_;
            }
            
            public Builder setSyncFlag(final int value) {
                this.syncFlag_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearSyncFlag() {
                this.syncFlag_ = 0;
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
    
    public interface MassivePropParamOrBuilder extends MessageOrBuilder
    {
        int getType();
        
        List<Integer> getReactionInfoListList();
        
        int getReactionInfoListCount();
        
        int getReactionInfoList(final int p0);
        
        List<Float> getParamListList();
        
        int getParamListCount();
        
        float getParamList(final int p0);
        
        int getSyncFlag();
    }
}
