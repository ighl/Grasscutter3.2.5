// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.Internal;
import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import java.util.ArrayList;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import java.util.Collections;
import com.google.protobuf.Parser;
import java.util.List;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class MassivePropSyncInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_MassivePropSyncInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_MassivePropSyncInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private MassivePropSyncInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return MassivePropSyncInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0019MassivePropSyncInfo.proto\u001a\u0016MassivePropParam.proto\"G\n\u0013MassivePropSyncInfo\u0012\n\n\u0002id\u0018\u0001 \u0001(\u0003\u0012$\n\tprop_list\u0018\u0002 \u0003(\u000b2\u0011.MassivePropParamB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        MassivePropSyncInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { MassivePropParamOuterClass.getDescriptor() });
        internal_static_MassivePropSyncInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_MassivePropSyncInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(MassivePropSyncInfoOuterClass.internal_static_MassivePropSyncInfo_descriptor, new String[] { "Id", "PropList" });
        MassivePropParamOuterClass.getDescriptor();
    }
    
    public static final class MassivePropSyncInfo extends GeneratedMessageV3 implements MassivePropSyncInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int ID_FIELD_NUMBER = 1;
        private long id_;
        public static final int PROP_LIST_FIELD_NUMBER = 2;
        private List<MassivePropParamOuterClass.MassivePropParam> propList_;
        private byte memoizedIsInitialized;
        private static final MassivePropSyncInfo DEFAULT_INSTANCE;
        private static final Parser<MassivePropSyncInfo> PARSER;
        
        private MassivePropSyncInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private MassivePropSyncInfo() {
            this.memoizedIsInitialized = -1;
            this.propList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new MassivePropSyncInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private MassivePropSyncInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.id_ = input.readInt64();
                            continue;
                        }
                        case 18: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.propList_ = new ArrayList<MassivePropParamOuterClass.MassivePropParam>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.propList_.add(input.readMessage(MassivePropParamOuterClass.MassivePropParam.parser(), extensionRegistry));
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
                    this.propList_ = Collections.unmodifiableList((List<? extends MassivePropParamOuterClass.MassivePropParam>)this.propList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return MassivePropSyncInfoOuterClass.internal_static_MassivePropSyncInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return MassivePropSyncInfoOuterClass.internal_static_MassivePropSyncInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(MassivePropSyncInfo.class, Builder.class);
        }
        
        @Override
        public long getId() {
            return this.id_;
        }
        
        @Override
        public List<MassivePropParamOuterClass.MassivePropParam> getPropListList() {
            return this.propList_;
        }
        
        @Override
        public List<? extends MassivePropParamOuterClass.MassivePropParamOrBuilder> getPropListOrBuilderList() {
            return this.propList_;
        }
        
        @Override
        public int getPropListCount() {
            return this.propList_.size();
        }
        
        @Override
        public MassivePropParamOuterClass.MassivePropParam getPropList(final int index) {
            return this.propList_.get(index);
        }
        
        @Override
        public MassivePropParamOuterClass.MassivePropParamOrBuilder getPropListOrBuilder(final int index) {
            return this.propList_.get(index);
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
            if (this.id_ != 0L) {
                output.writeInt64(1, this.id_);
            }
            for (int i = 0; i < this.propList_.size(); ++i) {
                output.writeMessage(2, this.propList_.get(i));
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
            if (this.id_ != 0L) {
                size += CodedOutputStream.computeInt64Size(1, this.id_);
            }
            for (int i = 0; i < this.propList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(2, this.propList_.get(i));
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MassivePropSyncInfo)) {
                return super.equals(obj);
            }
            final MassivePropSyncInfo other = (MassivePropSyncInfo)obj;
            return this.getId() == other.getId() && this.getPropListList().equals(other.getPropListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + Internal.hashLong(this.getId());
            if (this.getPropListCount() > 0) {
                hash = 37 * hash + 2;
                hash = 53 * hash + this.getPropListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static MassivePropSyncInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return MassivePropSyncInfo.PARSER.parseFrom(data);
        }
        
        public static MassivePropSyncInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MassivePropSyncInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MassivePropSyncInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return MassivePropSyncInfo.PARSER.parseFrom(data);
        }
        
        public static MassivePropSyncInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MassivePropSyncInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MassivePropSyncInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return MassivePropSyncInfo.PARSER.parseFrom(data);
        }
        
        public static MassivePropSyncInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MassivePropSyncInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MassivePropSyncInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MassivePropSyncInfo.PARSER, input);
        }
        
        public static MassivePropSyncInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MassivePropSyncInfo.PARSER, input, extensionRegistry);
        }
        
        public static MassivePropSyncInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(MassivePropSyncInfo.PARSER, input);
        }
        
        public static MassivePropSyncInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(MassivePropSyncInfo.PARSER, input, extensionRegistry);
        }
        
        public static MassivePropSyncInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MassivePropSyncInfo.PARSER, input);
        }
        
        public static MassivePropSyncInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MassivePropSyncInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return MassivePropSyncInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final MassivePropSyncInfo prototype) {
            return MassivePropSyncInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == MassivePropSyncInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static MassivePropSyncInfo getDefaultInstance() {
            return MassivePropSyncInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<MassivePropSyncInfo> parser() {
            return MassivePropSyncInfo.PARSER;
        }
        
        @Override
        public Parser<MassivePropSyncInfo> getParserForType() {
            return MassivePropSyncInfo.PARSER;
        }
        
        @Override
        public MassivePropSyncInfo getDefaultInstanceForType() {
            return MassivePropSyncInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new MassivePropSyncInfo();
            PARSER = new AbstractParser<MassivePropSyncInfo>() {
                @Override
                public MassivePropSyncInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new MassivePropSyncInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MassivePropSyncInfoOrBuilder
        {
            private int bitField0_;
            private long id_;
            private List<MassivePropParamOuterClass.MassivePropParam> propList_;
            private RepeatedFieldBuilderV3<MassivePropParamOuterClass.MassivePropParam, MassivePropParamOuterClass.MassivePropParam.Builder, MassivePropParamOuterClass.MassivePropParamOrBuilder> propListBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return MassivePropSyncInfoOuterClass.internal_static_MassivePropSyncInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return MassivePropSyncInfoOuterClass.internal_static_MassivePropSyncInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(MassivePropSyncInfo.class, Builder.class);
            }
            
            private Builder() {
                this.propList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.propList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (MassivePropSyncInfo.alwaysUseFieldBuilders) {
                    this.getPropListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.id_ = 0L;
                if (this.propListBuilder_ == null) {
                    this.propList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.propListBuilder_.clear();
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return MassivePropSyncInfoOuterClass.internal_static_MassivePropSyncInfo_descriptor;
            }
            
            @Override
            public MassivePropSyncInfo getDefaultInstanceForType() {
                return MassivePropSyncInfo.getDefaultInstance();
            }
            
            @Override
            public MassivePropSyncInfo build() {
                final MassivePropSyncInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public MassivePropSyncInfo buildPartial() {
                final MassivePropSyncInfo result = new MassivePropSyncInfo(this);
                final int from_bitField0_ = this.bitField0_;
                result.id_ = this.id_;
                if (this.propListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.propList_ = Collections.unmodifiableList((List<? extends MassivePropParamOuterClass.MassivePropParam>)this.propList_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.propList_ = this.propList_;
                }
                else {
                    result.propList_ = this.propListBuilder_.build();
                }
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
                if (other instanceof MassivePropSyncInfo) {
                    return this.mergeFrom((MassivePropSyncInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final MassivePropSyncInfo other) {
                if (other == MassivePropSyncInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.getId() != 0L) {
                    this.setId(other.getId());
                }
                if (this.propListBuilder_ == null) {
                    if (!other.propList_.isEmpty()) {
                        if (this.propList_.isEmpty()) {
                            this.propList_ = other.propList_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensurePropListIsMutable();
                            this.propList_.addAll(other.propList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.propList_.isEmpty()) {
                    if (this.propListBuilder_.isEmpty()) {
                        this.propListBuilder_.dispose();
                        this.propListBuilder_ = null;
                        this.propList_ = other.propList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.propListBuilder_ = (MassivePropSyncInfo.alwaysUseFieldBuilders ? this.getPropListFieldBuilder() : null);
                    }
                    else {
                        this.propListBuilder_.addAllMessages(other.propList_);
                    }
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
                MassivePropSyncInfo parsedMessage = null;
                try {
                    parsedMessage = MassivePropSyncInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (MassivePropSyncInfo)e.getUnfinishedMessage();
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
            public long getId() {
                return this.id_;
            }
            
            public Builder setId(final long value) {
                this.id_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearId() {
                this.id_ = 0L;
                this.onChanged();
                return this;
            }
            
            private void ensurePropListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.propList_ = new ArrayList<MassivePropParamOuterClass.MassivePropParam>(this.propList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<MassivePropParamOuterClass.MassivePropParam> getPropListList() {
                if (this.propListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends MassivePropParamOuterClass.MassivePropParam>)this.propList_);
                }
                return this.propListBuilder_.getMessageList();
            }
            
            @Override
            public int getPropListCount() {
                if (this.propListBuilder_ == null) {
                    return this.propList_.size();
                }
                return this.propListBuilder_.getCount();
            }
            
            @Override
            public MassivePropParamOuterClass.MassivePropParam getPropList(final int index) {
                if (this.propListBuilder_ == null) {
                    return this.propList_.get(index);
                }
                return this.propListBuilder_.getMessage(index);
            }
            
            public Builder setPropList(final int index, final MassivePropParamOuterClass.MassivePropParam value) {
                if (this.propListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensurePropListIsMutable();
                    this.propList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.propListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setPropList(final int index, final MassivePropParamOuterClass.MassivePropParam.Builder builderForValue) {
                if (this.propListBuilder_ == null) {
                    this.ensurePropListIsMutable();
                    this.propList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.propListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addPropList(final MassivePropParamOuterClass.MassivePropParam value) {
                if (this.propListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensurePropListIsMutable();
                    this.propList_.add(value);
                    this.onChanged();
                }
                else {
                    this.propListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addPropList(final int index, final MassivePropParamOuterClass.MassivePropParam value) {
                if (this.propListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensurePropListIsMutable();
                    this.propList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.propListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addPropList(final MassivePropParamOuterClass.MassivePropParam.Builder builderForValue) {
                if (this.propListBuilder_ == null) {
                    this.ensurePropListIsMutable();
                    this.propList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.propListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addPropList(final int index, final MassivePropParamOuterClass.MassivePropParam.Builder builderForValue) {
                if (this.propListBuilder_ == null) {
                    this.ensurePropListIsMutable();
                    this.propList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.propListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllPropList(final Iterable<? extends MassivePropParamOuterClass.MassivePropParam> values) {
                if (this.propListBuilder_ == null) {
                    this.ensurePropListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.propList_);
                    this.onChanged();
                }
                else {
                    this.propListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearPropList() {
                if (this.propListBuilder_ == null) {
                    this.propList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.propListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removePropList(final int index) {
                if (this.propListBuilder_ == null) {
                    this.ensurePropListIsMutable();
                    this.propList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.propListBuilder_.remove(index);
                }
                return this;
            }
            
            public MassivePropParamOuterClass.MassivePropParam.Builder getPropListBuilder(final int index) {
                return this.getPropListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public MassivePropParamOuterClass.MassivePropParamOrBuilder getPropListOrBuilder(final int index) {
                if (this.propListBuilder_ == null) {
                    return this.propList_.get(index);
                }
                return this.propListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends MassivePropParamOuterClass.MassivePropParamOrBuilder> getPropListOrBuilderList() {
                if (this.propListBuilder_ != null) {
                    return this.propListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends MassivePropParamOuterClass.MassivePropParamOrBuilder>)this.propList_);
            }
            
            public MassivePropParamOuterClass.MassivePropParam.Builder addPropListBuilder() {
                return this.getPropListFieldBuilder().addBuilder(MassivePropParamOuterClass.MassivePropParam.getDefaultInstance());
            }
            
            public MassivePropParamOuterClass.MassivePropParam.Builder addPropListBuilder(final int index) {
                return this.getPropListFieldBuilder().addBuilder(index, MassivePropParamOuterClass.MassivePropParam.getDefaultInstance());
            }
            
            public List<MassivePropParamOuterClass.MassivePropParam.Builder> getPropListBuilderList() {
                return this.getPropListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<MassivePropParamOuterClass.MassivePropParam, MassivePropParamOuterClass.MassivePropParam.Builder, MassivePropParamOuterClass.MassivePropParamOrBuilder> getPropListFieldBuilder() {
                if (this.propListBuilder_ == null) {
                    this.propListBuilder_ = new RepeatedFieldBuilderV3<MassivePropParamOuterClass.MassivePropParam, MassivePropParamOuterClass.MassivePropParam.Builder, MassivePropParamOuterClass.MassivePropParamOrBuilder>(this.propList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.propList_ = null;
                }
                return this.propListBuilder_;
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
    
    public interface MassivePropSyncInfoOrBuilder extends MessageOrBuilder
    {
        long getId();
        
        List<MassivePropParamOuterClass.MassivePropParam> getPropListList();
        
        MassivePropParamOuterClass.MassivePropParam getPropList(final int p0);
        
        int getPropListCount();
        
        List<? extends MassivePropParamOuterClass.MassivePropParamOrBuilder> getPropListOrBuilderList();
        
        MassivePropParamOuterClass.MassivePropParamOrBuilder getPropListOrBuilder(final int p0);
    }
}
