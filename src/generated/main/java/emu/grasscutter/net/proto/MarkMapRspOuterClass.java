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

public final class MarkMapRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_MarkMapRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_MarkMapRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private MarkMapRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return MarkMapRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0010MarkMapRsp.proto\u001a\u0012MapMarkPoint.proto\"?\n\nMarkMapRsp\u0012 \n\tmark_list\u0018\u000b \u0003(\u000b2\r.MapMarkPoint\u0012\u000f\n\u0007retcode\u0018\u0001 \u0001(\u0005B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        MarkMapRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { MapMarkPointOuterClass.getDescriptor() });
        internal_static_MarkMapRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_MarkMapRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(MarkMapRspOuterClass.internal_static_MarkMapRsp_descriptor, new String[] { "MarkList", "Retcode" });
        MapMarkPointOuterClass.getDescriptor();
    }
    
    public static final class MarkMapRsp extends GeneratedMessageV3 implements MarkMapRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int MARK_LIST_FIELD_NUMBER = 11;
        private List<MapMarkPointOuterClass.MapMarkPoint> markList_;
        public static final int RETCODE_FIELD_NUMBER = 1;
        private int retcode_;
        private byte memoizedIsInitialized;
        private static final MarkMapRsp DEFAULT_INSTANCE;
        private static final Parser<MarkMapRsp> PARSER;
        
        private MarkMapRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private MarkMapRsp() {
            this.memoizedIsInitialized = -1;
            this.markList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new MarkMapRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private MarkMapRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.retcode_ = input.readInt32();
                            continue;
                        }
                        case 90: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.markList_ = new ArrayList<MapMarkPointOuterClass.MapMarkPoint>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.markList_.add(input.readMessage(MapMarkPointOuterClass.MapMarkPoint.parser(), extensionRegistry));
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
                    this.markList_ = Collections.unmodifiableList((List<? extends MapMarkPointOuterClass.MapMarkPoint>)this.markList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return MarkMapRspOuterClass.internal_static_MarkMapRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return MarkMapRspOuterClass.internal_static_MarkMapRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(MarkMapRsp.class, Builder.class);
        }
        
        @Override
        public List<MapMarkPointOuterClass.MapMarkPoint> getMarkListList() {
            return this.markList_;
        }
        
        @Override
        public List<? extends MapMarkPointOuterClass.MapMarkPointOrBuilder> getMarkListOrBuilderList() {
            return this.markList_;
        }
        
        @Override
        public int getMarkListCount() {
            return this.markList_.size();
        }
        
        @Override
        public MapMarkPointOuterClass.MapMarkPoint getMarkList(final int index) {
            return this.markList_.get(index);
        }
        
        @Override
        public MapMarkPointOuterClass.MapMarkPointOrBuilder getMarkListOrBuilder(final int index) {
            return this.markList_.get(index);
        }
        
        @Override
        public int getRetcode() {
            return this.retcode_;
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
            if (this.retcode_ != 0) {
                output.writeInt32(1, this.retcode_);
            }
            for (int i = 0; i < this.markList_.size(); ++i) {
                output.writeMessage(11, this.markList_.get(i));
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
            if (this.retcode_ != 0) {
                size += CodedOutputStream.computeInt32Size(1, this.retcode_);
            }
            for (int i = 0; i < this.markList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(11, this.markList_.get(i));
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MarkMapRsp)) {
                return super.equals(obj);
            }
            final MarkMapRsp other = (MarkMapRsp)obj;
            return this.getMarkListList().equals(other.getMarkListList()) && this.getRetcode() == other.getRetcode() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getMarkListCount() > 0) {
                hash = 37 * hash + 11;
                hash = 53 * hash + this.getMarkListList().hashCode();
            }
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getRetcode();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static MarkMapRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return MarkMapRsp.PARSER.parseFrom(data);
        }
        
        public static MarkMapRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MarkMapRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MarkMapRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return MarkMapRsp.PARSER.parseFrom(data);
        }
        
        public static MarkMapRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MarkMapRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MarkMapRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return MarkMapRsp.PARSER.parseFrom(data);
        }
        
        public static MarkMapRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MarkMapRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MarkMapRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MarkMapRsp.PARSER, input);
        }
        
        public static MarkMapRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MarkMapRsp.PARSER, input, extensionRegistry);
        }
        
        public static MarkMapRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(MarkMapRsp.PARSER, input);
        }
        
        public static MarkMapRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(MarkMapRsp.PARSER, input, extensionRegistry);
        }
        
        public static MarkMapRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MarkMapRsp.PARSER, input);
        }
        
        public static MarkMapRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MarkMapRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return MarkMapRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final MarkMapRsp prototype) {
            return MarkMapRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == MarkMapRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static MarkMapRsp getDefaultInstance() {
            return MarkMapRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<MarkMapRsp> parser() {
            return MarkMapRsp.PARSER;
        }
        
        @Override
        public Parser<MarkMapRsp> getParserForType() {
            return MarkMapRsp.PARSER;
        }
        
        @Override
        public MarkMapRsp getDefaultInstanceForType() {
            return MarkMapRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new MarkMapRsp();
            PARSER = new AbstractParser<MarkMapRsp>() {
                @Override
                public MarkMapRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new MarkMapRsp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MarkMapRspOrBuilder
        {
            private int bitField0_;
            private List<MapMarkPointOuterClass.MapMarkPoint> markList_;
            private RepeatedFieldBuilderV3<MapMarkPointOuterClass.MapMarkPoint, MapMarkPointOuterClass.MapMarkPoint.Builder, MapMarkPointOuterClass.MapMarkPointOrBuilder> markListBuilder_;
            private int retcode_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return MarkMapRspOuterClass.internal_static_MarkMapRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return MarkMapRspOuterClass.internal_static_MarkMapRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(MarkMapRsp.class, Builder.class);
            }
            
            private Builder() {
                this.markList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.markList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (MarkMapRsp.alwaysUseFieldBuilders) {
                    this.getMarkListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.markListBuilder_ == null) {
                    this.markList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.markListBuilder_.clear();
                }
                this.retcode_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return MarkMapRspOuterClass.internal_static_MarkMapRsp_descriptor;
            }
            
            @Override
            public MarkMapRsp getDefaultInstanceForType() {
                return MarkMapRsp.getDefaultInstance();
            }
            
            @Override
            public MarkMapRsp build() {
                final MarkMapRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public MarkMapRsp buildPartial() {
                final MarkMapRsp result = new MarkMapRsp(this);
                final int from_bitField0_ = this.bitField0_;
                if (this.markListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.markList_ = Collections.unmodifiableList((List<? extends MapMarkPointOuterClass.MapMarkPoint>)this.markList_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.markList_ = this.markList_;
                }
                else {
                    result.markList_ = this.markListBuilder_.build();
                }
                result.retcode_ = this.retcode_;
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
                if (other instanceof MarkMapRsp) {
                    return this.mergeFrom((MarkMapRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final MarkMapRsp other) {
                if (other == MarkMapRsp.getDefaultInstance()) {
                    return this;
                }
                if (this.markListBuilder_ == null) {
                    if (!other.markList_.isEmpty()) {
                        if (this.markList_.isEmpty()) {
                            this.markList_ = other.markList_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureMarkListIsMutable();
                            this.markList_.addAll(other.markList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.markList_.isEmpty()) {
                    if (this.markListBuilder_.isEmpty()) {
                        this.markListBuilder_.dispose();
                        this.markListBuilder_ = null;
                        this.markList_ = other.markList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.markListBuilder_ = (MarkMapRsp.alwaysUseFieldBuilders ? this.getMarkListFieldBuilder() : null);
                    }
                    else {
                        this.markListBuilder_.addAllMessages(other.markList_);
                    }
                }
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
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
                MarkMapRsp parsedMessage = null;
                try {
                    parsedMessage = MarkMapRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (MarkMapRsp)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureMarkListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.markList_ = new ArrayList<MapMarkPointOuterClass.MapMarkPoint>(this.markList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<MapMarkPointOuterClass.MapMarkPoint> getMarkListList() {
                if (this.markListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends MapMarkPointOuterClass.MapMarkPoint>)this.markList_);
                }
                return this.markListBuilder_.getMessageList();
            }
            
            @Override
            public int getMarkListCount() {
                if (this.markListBuilder_ == null) {
                    return this.markList_.size();
                }
                return this.markListBuilder_.getCount();
            }
            
            @Override
            public MapMarkPointOuterClass.MapMarkPoint getMarkList(final int index) {
                if (this.markListBuilder_ == null) {
                    return this.markList_.get(index);
                }
                return this.markListBuilder_.getMessage(index);
            }
            
            public Builder setMarkList(final int index, final MapMarkPointOuterClass.MapMarkPoint value) {
                if (this.markListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureMarkListIsMutable();
                    this.markList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.markListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setMarkList(final int index, final MapMarkPointOuterClass.MapMarkPoint.Builder builderForValue) {
                if (this.markListBuilder_ == null) {
                    this.ensureMarkListIsMutable();
                    this.markList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.markListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addMarkList(final MapMarkPointOuterClass.MapMarkPoint value) {
                if (this.markListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureMarkListIsMutable();
                    this.markList_.add(value);
                    this.onChanged();
                }
                else {
                    this.markListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addMarkList(final int index, final MapMarkPointOuterClass.MapMarkPoint value) {
                if (this.markListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureMarkListIsMutable();
                    this.markList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.markListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addMarkList(final MapMarkPointOuterClass.MapMarkPoint.Builder builderForValue) {
                if (this.markListBuilder_ == null) {
                    this.ensureMarkListIsMutable();
                    this.markList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.markListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addMarkList(final int index, final MapMarkPointOuterClass.MapMarkPoint.Builder builderForValue) {
                if (this.markListBuilder_ == null) {
                    this.ensureMarkListIsMutable();
                    this.markList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.markListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllMarkList(final Iterable<? extends MapMarkPointOuterClass.MapMarkPoint> values) {
                if (this.markListBuilder_ == null) {
                    this.ensureMarkListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.markList_);
                    this.onChanged();
                }
                else {
                    this.markListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearMarkList() {
                if (this.markListBuilder_ == null) {
                    this.markList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.markListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeMarkList(final int index) {
                if (this.markListBuilder_ == null) {
                    this.ensureMarkListIsMutable();
                    this.markList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.markListBuilder_.remove(index);
                }
                return this;
            }
            
            public MapMarkPointOuterClass.MapMarkPoint.Builder getMarkListBuilder(final int index) {
                return this.getMarkListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public MapMarkPointOuterClass.MapMarkPointOrBuilder getMarkListOrBuilder(final int index) {
                if (this.markListBuilder_ == null) {
                    return this.markList_.get(index);
                }
                return this.markListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends MapMarkPointOuterClass.MapMarkPointOrBuilder> getMarkListOrBuilderList() {
                if (this.markListBuilder_ != null) {
                    return this.markListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends MapMarkPointOuterClass.MapMarkPointOrBuilder>)this.markList_);
            }
            
            public MapMarkPointOuterClass.MapMarkPoint.Builder addMarkListBuilder() {
                return this.getMarkListFieldBuilder().addBuilder(MapMarkPointOuterClass.MapMarkPoint.getDefaultInstance());
            }
            
            public MapMarkPointOuterClass.MapMarkPoint.Builder addMarkListBuilder(final int index) {
                return this.getMarkListFieldBuilder().addBuilder(index, MapMarkPointOuterClass.MapMarkPoint.getDefaultInstance());
            }
            
            public List<MapMarkPointOuterClass.MapMarkPoint.Builder> getMarkListBuilderList() {
                return this.getMarkListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<MapMarkPointOuterClass.MapMarkPoint, MapMarkPointOuterClass.MapMarkPoint.Builder, MapMarkPointOuterClass.MapMarkPointOrBuilder> getMarkListFieldBuilder() {
                if (this.markListBuilder_ == null) {
                    this.markListBuilder_ = new RepeatedFieldBuilderV3<MapMarkPointOuterClass.MapMarkPoint, MapMarkPointOuterClass.MapMarkPoint.Builder, MapMarkPointOuterClass.MapMarkPointOrBuilder>(this.markList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.markList_ = null;
                }
                return this.markListBuilder_;
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
            public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }
            
            @Override
            public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }
        }
    }
    
    public interface MarkMapRspOrBuilder extends MessageOrBuilder
    {
        List<MapMarkPointOuterClass.MapMarkPoint> getMarkListList();
        
        MapMarkPointOuterClass.MapMarkPoint getMarkList(final int p0);
        
        int getMarkListCount();
        
        List<? extends MapMarkPointOuterClass.MapMarkPointOrBuilder> getMarkListOrBuilderList();
        
        MapMarkPointOuterClass.MapMarkPointOrBuilder getMarkListOrBuilder(final int p0);
        
        int getRetcode();
    }
}
